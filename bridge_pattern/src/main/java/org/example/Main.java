package org.example;

import org.example.demo.MacOS;
import org.example.demo.UIBridgeAbstraction;
import org.example.ui.FlatUI;

public class Main {
    public static void main(String[] args) {
        UIBridgeAbstraction ui = new FlatUI(new MacOS());
        System.out.println(ui.operate());
        System.out.println(ui.menu());
        System.out.println(ui.sideBar());
        System.out.println(ui.button());
    }
}