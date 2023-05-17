package org.example;

public class Main {
    public static void main(String[] args) {

        ToyFactoryAbstraction tfa = new RobotFactory();

        IToy factory = tfa.createToy();

        System.out.println(factory.makeToy());
    }
}