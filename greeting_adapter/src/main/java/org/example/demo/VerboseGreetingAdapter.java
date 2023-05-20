package org.example.demo;

public class VerboseGreetingAdapter implements IGreeting{
    private FormalGreetingAdapter formalGreetingAdapter;

    public VerboseGreetingAdapter(FormalGreetingAdapter formalGreetingAdapter) {
        this.formalGreetingAdapter = formalGreetingAdapter;
    }

    @Override
    public String greet(String name, String greetee, String message) {

        return message +" "+formalGreetingAdapter.greet(name)+" From "+greetee;
    }
}
