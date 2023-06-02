package com.RQCODE.exampleProject.Conciseness.GoodRequirement;

import com.RQCODE.exampleProject.Conciseness.Clock;

public class MinuteIncrease extends SecondLap {

    public MinuteIncrease(){
        super("If on tick second became 0 minute must increase by one untill 59");
    }

    public MinuteIncrease(String statement){
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock(59);
        clock.tick();
        int initMinute = clock.getMinute();
        if (clock.getSecond() == 0 && clock.getMinute() == initMinute + 1) {
            return super.check();
        }
        return CheckStatus.FAIL;
    }
}
