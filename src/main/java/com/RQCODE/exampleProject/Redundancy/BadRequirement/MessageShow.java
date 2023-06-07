package com.RQCODE.exampleProject.Redundancy.BadRequirement;

import com.RQCODE.exampleProject.Redundancy.Message;

import rqcode.concepts.Requirement;

public class MessageShow extends Requirement{
    
    @Override
    public CheckStatus check() {
        String msg1 = "message";
        if(!new Message(msg1).showMessage().equals(msg1)){
            return CheckStatus.FAIL;
        }
        return CheckStatus.PASS;
    }
}
