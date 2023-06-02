package com.RQCODE.exampleProject.Conciseness;

public class Clock {
    private int second;
    private int minute; 

    public Clock(){
        second = 0;
        minute = 0;
    }

    public Clock(int second){
        this.second = second;
        while(second >= 60){
            second -= 60;
            minute++;
        }
    }

    public int getSecond(){ 
        return second;
    }
    
    public int getMinute(){
        return minute;
    }

    public void tick(){
        second++;
        if(second >= 60){
            second = 0;
            minute++;
        }
        if(minute >= 60){
            minute = 0;
        }
    }
}
