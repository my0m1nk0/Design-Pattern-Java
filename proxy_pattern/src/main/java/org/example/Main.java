package org.example;

import org.example.demo.ISubject;
import org.example.demo.ProxySubject;
import org.example.demo.RealSubject;

public class Main {
    public static void main(String[] args) {

        ISubject obj = new ProxySubject(new RealSubject());
        obj.doSomething();

    }
}