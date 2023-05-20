package org.example.ui;

import org.example.demo.IOS;
import org.example.demo.UIBridgeAbstraction;

public class FlatUI extends UIBridgeAbstraction {
    public FlatUI(IOS ios) {
        super(ios);
    }

    @Override
    public String operate() {
        return ios.Operate();
    }

    @Override
    public String menu() {
        return "flat menu";
    }

    @Override
    public String sideBar() {
        return "flat sidebar";
    }

    @Override
    public String button() {
        return "flat button";
    }
}
