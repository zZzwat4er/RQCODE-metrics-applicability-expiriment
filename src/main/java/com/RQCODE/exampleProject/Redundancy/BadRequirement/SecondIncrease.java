package com.RQCODE.exampleProject.Redundancy.BadRequirement;

import com.RQCODE.exampleProject.Redundancy.Clock;

import rqcode.concepts.Requirement;

public class SecondIncrease extends Requirement {

    public SecondIncrease() {
        super("On clock tick second must increse by one untill 59");
    }

    public SecondIncrease(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        int initSecond = clock.getSecond();
        if (clock.getSecond() > 59) {
            return CheckStatus.INCOMPLETE;
        }
        clock.tick();
        if (clock.getSecond() == initSecond + 1) {
            return CheckStatus.PASS;
        }
        return CheckStatus.FAIL;
    }
}
