package com.RQCODE.exampleProject.Modifiable;

public class App {
    private long updateTime;
    
    public App(long updateTime){
        this.updateTime = updateTime;
    }

    public Long estimateTimeToUpdate(long currentTime){
        return updateTime - currentTime;
    }
    
}
