package org.example.demo;

public abstract class UIBridgeAbstraction {

    protected IOS ios;

    public UIBridgeAbstraction(IOS ios){
        super();
        this.ios=ios;
    }

//    for os

    public abstract String operate();


//    for ui

    public abstract String menu();
    public abstract String sideBar();

    public abstract String button();
}
