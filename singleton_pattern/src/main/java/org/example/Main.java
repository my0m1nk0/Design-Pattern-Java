package org.example;

import org.example.demo.MyStance;

public class Main {
    public static void main(String[] args) {


        MyStance m1 =MyStance.getInstance();
        MyStance m2 =MyStance.getInstance();
        MyStance m3 =MyStance.getInstance();

        boolean memoryAddress = m1==m3;
        boolean memoryAddr = m1.equals(m3);
        System.out.println("m1 & m3 are same : " + memoryAddress);
        System.out.println("m1 & m3 are same : " + memoryAddr);

        System.out.println(m1);
        System.out.println(m3);
    }
}