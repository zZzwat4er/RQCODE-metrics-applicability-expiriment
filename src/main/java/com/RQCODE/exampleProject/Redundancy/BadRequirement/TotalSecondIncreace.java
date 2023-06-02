package com.RQCODE.exampleProject.Redundancy.BadRequirement;


import com.RQCODE.exampleProject.Redundancy.Clock;

import rqcode.concepts.Requirement;

public class TotalSecondIncreace extends Requirement {

    public TotalSecondIncreace() {
        super("The clock tracks the total number of seconds that increase on tick");
    }

    public TotalSecondIncreace(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        int initTotalSeconds = clock.getTotalSeconds();
        clock.tick();
        if(clock.getTotalSeconds() != initTotalSeconds + 1){
            return CheckStatus.FAIL;
        }
        return CheckStatus.PASS;
    }
}
