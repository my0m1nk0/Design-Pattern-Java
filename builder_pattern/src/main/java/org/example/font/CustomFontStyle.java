package org.example.font;

public class CustomFontStyle implements IFontStyle{
    @Override
    public String fontStyle() {
        return "<Custom Font Style!>";
    }

    @Override
    public String toString() {
        return "CustomFontStyle";
    }
}
