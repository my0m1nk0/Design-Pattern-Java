package org.example.ui;

import org.example.demo.IOS;
import org.example.demo.UIBridgeAbstraction;

public class MaterialUI extends UIBridgeAbstraction {

    public MaterialUI(IOS ios) {
        super(ios);
    }

    @Override
    public String operate() {
        return ios.Operate();
    }

    @Override
    public String menu() {
        return "Material Menu";
    }

    @Override
    public String sideBar() {
        return "Material Sidebar";
    }

    @Override
    public String button() {
        return "Material button";
    }
}
