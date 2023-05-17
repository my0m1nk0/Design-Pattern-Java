package org.example;

public class CarToyFactory extends ToyFactoryAbstraction{
    @Override
    public IToy createToy() {
        return new CarToy();
    }
}
