package com.cheer.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {

    private Object realSubject;

    public Handler(Object realSubject) {
        this.realSubject = realSubject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("沙雕是贾兴国？");
        // 反射方式调用方法，实际上是在调用真实对象的方法
        Object result = method.invoke(this.realSubject,args);
        System.out.println("YES！");
        return result;
    }
}
