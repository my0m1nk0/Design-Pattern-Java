package org.example.ui;

import org.example.demo.IOS;
import org.example.demo.UIBridgeAbstraction;

public class DarkUI extends UIBridgeAbstraction {
    public DarkUI(IOS ios) {
        super(ios);
    }

    @Override
    public String operate() {
        return ios.Operate();
    }

    @Override
    public String menu() {
        return "Dark Menu";
    }

    @Override
    public String sideBar() {
        return "Dark SideBar";
    }

    @Override
    public String button() {
        return "Dark Button";
    }
}
