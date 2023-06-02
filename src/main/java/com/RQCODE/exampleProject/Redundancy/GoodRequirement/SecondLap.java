package com.RQCODE.exampleProject.Redundancy.GoodRequirement;

import com.RQCODE.exampleProject.Redundancy.Clock;

import rqcode.concepts.Requirement;

public class SecondLap extends Requirement {

    public SecondLap() {
        super("If second = 59 on tick it should be equial to 0");
    }

    public SecondLap(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock(59);
        clock.tick();
        if (clock.getSecond() == 0) {
            return CheckStatus.PASS;
        }
        return CheckStatus.FAIL;
    }
}
