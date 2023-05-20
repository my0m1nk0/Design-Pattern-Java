package org.example.demo;

public class ModernTvAdapter implements ITV{
    private OldTVAdaptee oldTVAdaptee;

    public ModernTvAdapter(OldTVAdaptee oldTVAdaptee) {
        this.oldTVAdaptee = oldTVAdaptee;
    }

    @Override
    public void switchOn() {
        oldTVAdaptee.turnToRight();

    }

    @Override
    public void switchOff() {
        oldTVAdaptee.turnToLeft();

    }
}
