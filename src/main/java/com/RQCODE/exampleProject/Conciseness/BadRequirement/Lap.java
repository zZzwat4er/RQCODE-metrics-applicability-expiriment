package com.RQCODE.exampleProject.Conciseness.BadRequirement;

import com.RQCODE.exampleProject.Conciseness.Clock;

public class Lap extends Increase {

    public Lap(){
        super("if minute/second should increace when it is equal to 59 it should became 0");
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock(59);
        clock.tick();
        if (clock.getSecond() != 0) {
            return CheckStatus.FAIL;
        }
        clock = new Clock(3599); // 3599s == 59m 59s
        if (clock.getMinute() != 0) {
            return CheckStatus.FAIL;
        }
        return super.check();
    }
}
