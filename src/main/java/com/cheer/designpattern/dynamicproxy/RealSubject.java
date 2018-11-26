package com.cheer.designpattern.dynamicproxy;

public class RealSubject implements Subject{
    public void request() {
        System.out.println("贾兴国沙雕！");
    }
}
