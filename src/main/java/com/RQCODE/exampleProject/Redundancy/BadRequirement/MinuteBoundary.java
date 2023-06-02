package com.RQCODE.exampleProject.Redundancy.BadRequirement;

import com.RQCODE.exampleProject.Redundancy.Clock;

public class MinuteBoundary extends MinuteIncrease {

    public MinuteBoundary(){
        super("Minute must be between 0 and 59");
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        for (int i = 0; i < (60 * 60); i++) {
            clock.tick();
            int currentMinute = clock.getMinute();
            if(currentMinute < 0 || currentMinute > 59){
                return CheckStatus.FAIL;
            }
        }
        return CheckStatus.PASS;
    }
}
