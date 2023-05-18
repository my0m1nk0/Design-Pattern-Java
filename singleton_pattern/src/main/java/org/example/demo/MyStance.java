package org.example.demo;

public class MyStance {
    private static MyStance myStance;

    private MyStance(){

    }
    public static MyStance getInstance(){
        if(myStance == null){
            myStance = new MyStance();
        }
        return myStance;
    }

}
