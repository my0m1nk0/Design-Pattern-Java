package org.example;

import org.example.demo.ITV;
import org.example.demo.ModernTvAdapter;
import org.example.demo.OldTVAdaptee;

public class Main {
    public static void main(String[] args) {
        ITV tv= new ModernTvAdapter(new OldTVAdaptee());
        tv.switchOff();
        tv.switchOn();


    }
}