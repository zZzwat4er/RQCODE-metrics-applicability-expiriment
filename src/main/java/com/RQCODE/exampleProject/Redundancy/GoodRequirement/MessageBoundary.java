package com.RQCODE.exampleProject.Redundancy.GoodRequirement;

import com.RQCODE.exampleProject.Redundancy.Message;

import rqcode.concepts.Requirement;

public class MessageBoundary extends Requirement{

    @Override
    public CheckStatus check() {
        String str = "";
        Message msg = new Message(str);
        for(int i = 0; i < 120; i++){
            if(msg.getSize() < 0 || msg.getSize() > 100){
                return CheckStatus.FAIL;
            }
            str += 'a';
            msg = new Message(str);
        }
        return CheckStatus.PASS;
    }
    
}
