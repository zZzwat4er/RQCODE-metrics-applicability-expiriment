package com.RQCODE.exampleProject.Redundancy.BadRequirement;

import com.RQCODE.exampleProject.Redundancy.Message;

import rqcode.concepts.Requirement;

public class MessageCreate extends Requirement{
    
    @Override
    public CheckStatus check() {
        String msg1 = "message";
        Message model = new Message("");
        model.createNewMessage(msg1);
        if(!model.showMessage().equals(msg1)){
            return CheckStatus.FAIL;
        }
        return CheckStatus.PASS;
    }
}
