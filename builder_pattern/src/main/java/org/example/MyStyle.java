package org.example;

import org.example.color.DefaultColor;
import org.example.color.IColor;
import org.example.font.DefaultFontStyle;
import org.example.font.IFontStyle;

public class MyStyle {
    private static IColor iColor= new DefaultColor();
    private static IFontStyle iFontStyle= new DefaultFontStyle();

    private MyStyle(IColor iColor, IFontStyle iFontStyle) {
        super();
        this.iColor = iColor;
        this.iFontStyle = iFontStyle;
    }
    public static MyStyle createMyStyle(){
        return new MyStyle(iColor,iFontStyle);
    }
    public IColor getiColor() {
        return iColor;
    }

    public void setiColor(IColor iColor) {
        this.iColor = iColor;
    }

    public IFontStyle getiFontStyle() {
        return iFontStyle;
    }

    public void setiFontStyle(IFontStyle iFontStyle) {
        this.iFontStyle = iFontStyle;
    }

    @Override
    public String toString() {
        return "MyStyle{" +
                "iColor=" + iColor +
                ", iFontStyle=" + iFontStyle +
                '}';
    }
    public MyStyle changeFont(IFontStyle FontStyle){
        iFontStyle =FontStyle;
        return this;
    }
    public MyStyle changeColor(IColor color){
        iColor = color;
        return this;
    }

    public static class MyStyleBuilder{
        private MyStyle myStyle;
        public MyStyleBuilder create(){
           myStyle=  new MyStyle(iColor,iFontStyle);
            return this;
        }

        public MyStyle build(){
            return myStyle;
        }
    }
}
