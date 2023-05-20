package org.example.demo;

public class ProxySubject implements ISubject{

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void doSomething() {
        doSomethingExtra();

        realSubject.doSomething();

    }

    private void doSomethingExtra(){
        System.out.println("Proxy Do Something Extra....");
    }
}
