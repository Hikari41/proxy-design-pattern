package com.cheer.designpattern.staticproxy;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject proxy = new Proxy(realSubject);
        proxy.request();
    }
}
