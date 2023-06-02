package com.RQCODE.exampleProject.Redundancy;

public class Clock {
    private int second;
    private int minute;
    private int totalSeconds; 

    public Clock(){
        second = 0;
        minute = 0;
        totalSeconds = 0;
    }

    public Clock(int second){
        this.second = second;
        totalSeconds = second;
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

    public int getTotalSeconds(){
        return minute;
    }

    public void tick(){
        second++;
        totalSeconds++;
        if(second >= 60){
            second = 0;
            minute++;
        }
        if(minute >= 60){
            minute = 0;
        }
        if(totalSeconds >= 60*60){
            totalSeconds = 0;
        }
    }
}
