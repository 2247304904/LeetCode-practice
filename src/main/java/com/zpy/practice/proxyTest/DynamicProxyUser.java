package com.zpy.practice.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Zhang Pengyu
 * @description
 * @date 2024/6/3 11:07
 * @since JDK 1.8
 **/
public class DynamicProxyUser implements InvocationHandler {

    private Object object;

    public DynamicProxyUser() {
    }

    public DynamicProxyUser(Object target) {
        this.object = target;
    }
    /**
     * 处理代理对象的逻辑，所有被代理对象的方法都会在invoke中执行
     * @param proxy 代理的对象
     * @param method  当前方法
     * @param args  方法运行参数
     * @return  方法调用结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("核对你的信息");
        // 执行目标方法
        Object target = method.invoke(object,args);
        System.out.println("更新成功");
        return target;
    }
}
