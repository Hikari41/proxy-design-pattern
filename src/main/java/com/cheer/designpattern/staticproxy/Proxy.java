package com.cheer.designpattern.staticproxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {
        this.realSubject.request();
        System.out.println("YES!");
    }
}
