package com.RQCODE.exampleProject.Modifiable;

public class Translator {
    public long timeDif;
    
    public Translator(long timeDif){
        this.timeDif = timeDif;
    }

    public long convert(long serverData){
        return serverData + timeDif;
    }
}
