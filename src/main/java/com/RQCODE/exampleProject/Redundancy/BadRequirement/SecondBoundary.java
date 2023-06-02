package com.RQCODE.exampleProject.Redundancy.BadRequirement;

import com.RQCODE.exampleProject.Redundancy.Clock;

public class SecondBoundary extends SecondIncrease {

    public SecondBoundary() {
        super("Second must be between 0 and 59");
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        for (int i = 0; i < 60; i++) {
            clock.tick();
            int currentSecond = clock.getSecond();
            if (currentSecond < 0 || currentSecond > 59) {
                return CheckStatus.FAIL;
            }
        }
        return super.check();
    }
}
