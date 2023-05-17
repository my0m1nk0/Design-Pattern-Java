package org.example.color;

public class DefaultColor implements IColor{
    @Override
    public String color() {
        return "Default Color!";
    }

    @Override
    public String toString() {
        return "DefaultColor{}";
    }
}
