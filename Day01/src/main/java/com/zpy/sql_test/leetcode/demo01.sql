-- 595. 大的国家
-- https://leetcode-cn.com/problems/big-countries/

select name,population,area  from world where area > 3000000 or  population > 25000000

-- or 会引起索引失效
-- 通常使用union代替or

SELECT
    name, population, area
FROM
    world
WHERE
        area >= 3000000

UNION

SELECT
    name, population, area
FROM
    world
WHERE
        population >= 25000000
;
