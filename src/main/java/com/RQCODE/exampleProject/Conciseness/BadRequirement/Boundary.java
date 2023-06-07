package com.RQCODE.exampleProject.Conciseness.BadRequirement;

import com.RQCODE.exampleProject.Conciseness.Clock;

public class Boundary extends Increase {

    public Boundary() {
        super("Second and Minute mast be between 0 and 59");
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        for (int i = 0; i < (60 * 60); i++) {
            if (clock.getSecond() < 0
                    || clock.getSecond() > 59
                    || clock.getMinute() < 0
                    || clock.getMinute() > 59) {
                return CheckStatus.FAIL;
            }
        }
        return super.check();
    }
}
