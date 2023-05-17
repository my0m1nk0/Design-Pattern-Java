package org.example.font;

public class DefaultFontStyle implements IFontStyle{
    @Override
    public String fontStyle() {
        return "<Default Font Style!>";
    }

    @Override
    public String toString() {
        return "DefaultFontStyle";
    }
}
