package org.example;

public class RobotFactory extends ToyFactoryAbstraction{
    @Override
    public IToy createToy() {
        return new Robot();
    }
}
