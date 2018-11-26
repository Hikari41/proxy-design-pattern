package com.cheer.designpattern.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(
                Client.class.getClassLoader(),
                realSubject.getClass().getInterfaces(),
                new Handler(realSubject));
        proxy.request();
    }
}
