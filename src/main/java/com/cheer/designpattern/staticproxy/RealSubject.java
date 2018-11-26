package com.cheer.designpattern.staticproxy;

public class RealSubject implements Subject{

    public void request() {
        System.out.println("贾兴国真的是沙雕嘛？");
    }
}
