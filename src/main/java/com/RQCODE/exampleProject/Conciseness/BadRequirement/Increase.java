package com.RQCODE.exampleProject.Conciseness.BadRequirement;

import com.RQCODE.exampleProject.Conciseness.Clock;

import rqcode.concepts.Requirement;

public class Increase extends Requirement {

    public Increase() {
        super("On clock tick second must increse by one and increse minute if it was 59 initialy");
    }

    public Increase(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock(1);
        int initSecond = clock.getSecond();
        clock.tick();
        if (clock.getSecond() != initSecond + 1) {
            return CheckStatus.FAIL;
        }
        int initMinute = clock.getMinute();
        for (int i = 0; i < 60; i++) {
            if (clock.getSecond() == 59) {
                clock.tick();
                if (clock.getMinute() != initMinute + 1) {
                    return CheckStatus.FAIL;
                }
            }
            clock.tick();
        }
        return CheckStatus.PASS;
    }
}
