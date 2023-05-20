package org.example;

import org.example.demo.FormalGreetingAdapter;
import org.example.demo.IGreeting;
import org.example.demo.VerboseGreetingAdapter;

public class Main {
    public static void main(String[] args) {
        IGreeting greeting = new VerboseGreetingAdapter(new FormalGreetingAdapter());
        System.out.println(greeting.greet("Thomas ","John","How are You?"));
    }
}