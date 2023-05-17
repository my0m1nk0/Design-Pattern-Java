package org.example;

public class PlainToyFactory extends ToyFactoryAbstraction{
    @Override
    public IToy createToy() {
        return new PlainToy();
    }
}
