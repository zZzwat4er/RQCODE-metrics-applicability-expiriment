package com.RQCODE.exampleProject.Redundancy.GoodRequirement;

import com.RQCODE.exampleProject.Redundancy.Message;

public class MessageCreate extends MessageBoundary{
    
    @Override
    public CheckStatus check() {
        if(super.check() == CheckStatus.FAIL){
            return CheckStatus.FAIL;
        }
        String msg1 = "message";
        String msg2 = "message too long to read message too long to read message too long to read message too long to read message too long to read";
        Message model = new Message("");
        model.createNewMessage(msg1);
        if(!model.showMessage().equals(msg1)){
            return CheckStatus.FAIL;
        }
        model.createNewMessage(msg2);
        if(!model.showMessage().equals(msg2.substring(0, 99))){
            return CheckStatus.FAIL;
        }
        return CheckStatus.PASS;
    }
}
