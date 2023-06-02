package com.RQCODE.exampleProject.Redundancy.BadRequirement;

import com.RQCODE.exampleProject.Redundancy.Clock;

public class TotalSecondBoundary extends TotalSecondIncreace {

    public TotalSecondBoundary() {
        super("The total number of seconds must be between 0 and 3599 (59m 59s)");
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        for(int i = 0; i < 3600; i++){
            clock.tick();
            if(clock.getTotalSeconds() < 0 || clock.getTotalSeconds() > 3599){
                return CheckStatus.FAIL;
            }
        }
        return super.check();
    }
}
