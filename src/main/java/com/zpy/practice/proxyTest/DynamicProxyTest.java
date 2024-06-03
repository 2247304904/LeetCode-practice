package com.zpy.practice.proxyTest;

import com.zpy.practice.proxyTest.impl.UserDaoImpl;

import java.lang.reflect.Proxy;

/**
 * @author Zhang Pengyu
 * @description
 * @date 2024/6/3 11:09
 * @since JDK 1.8
 **/
public class DynamicProxyTest {
    public static void main(String[] args) {

        // 目标对象
        UserDao userDao = new UserDaoImpl();

        DynamicProxyUser dynamicProxyUser = new DynamicProxyUser(userDao);

        ClassLoader loader = userDao.getClass().getClassLoader();

        // 调用Proxy的newProxyInstance()方法生成最终的代理对象
        UserDao proxy = (UserDao) Proxy.newProxyInstance(loader,new Class[]{UserDao.class},dynamicProxyUser);

        System.out.println(proxy.getClass().getName());
        proxy.update();
    }
}

