package com.zpy.practice.dto;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Pengyu
 * @description 搜狗api
 * @date 2024/5/21 11:26
 * @since JDK 1.8
 **/



public class Sogou {
    private static final String WEB_URL = "https://www.sogou.com/web";
    private static final String LINK_URL = "https://www.sogou.com/";
    private static final String RESULTS_SELECTOR = "#main .results";
    private static final String RESULT_TITLE_SELECTOR = ".vr-title";
    private static final String RESULT_LINK_SELECTOR = ".vr-title > a";
    private static final String[] RESULT_SNIPPET_SELECTORS = {".star-wiki", ".fz-mid", ".attribute-centent"};
    private static final String[] RESULT_SNIPPET_EXCLUDED_SELECTORS = {".text-lightgray", ".zan-box", ".tag-website"};
    private static final String RELATED_SELECTOR = "#main .vrwrap.middle-better-hintBox .hint-mid";

    private final String query;

    public Sogou(String query) {
        this.query = query;
    }

    public void init() throws IOException {
        Document document = search(this.query);
        List<Result> results = getResults(document);
        List<String> relatedQueries = getRelatedQueries(document);

        // 打印结果和相关查询
        for (Result result : results) {
            System.out.println(result);
        }
        for (String relatedQuery : relatedQueries) {
            System.out.println(relatedQuery);
        }
    }

    private Document search(String query) throws IOException {
        //encodeurl
        String encodedQuery = URLEncoder.encode(query, "UTF-8");
        String searchUrl = WEB_URL + "?query=" + encodedQuery;
        String response = httpRequest(searchUrl);
        return Jsoup.parse(response);
    }

    private String httpRequest(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "*/*");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();

        return content.toString();
    }

    public List<String> getRelatedQueries(Document document) {
        Elements relatedElements = document.select(RELATED_SELECTOR);
        return relatedElements.eachText();
    }

    public List<Result> getResults(Document document) throws IOException {
        Elements resultElements = document.select(RESULTS_SELECTOR).first().children();
        List<Result> results = new ArrayList<>();
        for (Element element : resultElements) {
            Result result = resultFilter(element);
            if (result != null && result.getUrl() != null && !result.getUrl().isEmpty()) {
                results.add(result);
            }
        }
        return results;
    }

    private Result resultFilter(Element element) throws IOException {
        String title = element.select(RESULT_TITLE_SELECTOR).text().replaceAll("\\n", "").trim();
        String link = element.select(RESULT_LINK_SELECTOR).attr("href");

        for (String selector : RESULT_SNIPPET_EXCLUDED_SELECTORS) {
            element.select(selector).remove();
        }

        StringBuilder snippets = new StringBuilder();
        for (String selector : RESULT_SNIPPET_SELECTORS) {
            snippets.append(element.select(selector).text().trim()).append(" ");
        }

        String url = link;
        if (link != null && !link.contains("http")) {
            url = getRealTargetUrl(link);
        }

        return new Result(title, url, snippets.toString().trim());
    }

    private String getRealTargetUrl(String url) throws IOException {
        if (url == null) return "";
        String fullUrl = LINK_URL + url;
        String response = httpRequest(fullUrl);

        Document document = Jsoup.parse(response);
        String scriptText = document.select("script").html();
        String realUrl = scriptText.split("\"")[1];
        return realUrl != null ? realUrl : "";
    }

    public static void main(String[] args) throws IOException {
        Sogou sogou = new Sogou("北京今天温度");
        sogou.init();
    }

    static class Result {
        private final String name;
        private final String url;
        private final String snippet;

        public Result(String name, String url, String snippet) {
            this.name = name;
            this.url = url;
            this.snippet = snippet;
        }

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }

        public String getSnippet() {
            return snippet;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    ", snippet='" + snippet + '\'' +
                    '}';
        }
    }
}
