package com.zpy.practice.proxyTest.impl;

import com.zpy.practice.proxyTest.UserDao;

/**
 * @author Zhang Pengyu
 * @description
 * @date 2024/6/3 11:07
 * @since JDK 1.8
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("update");
    }
}
