package com.RQCODE.exampleProject.Redundancy.GoodRequirement;

import com.RQCODE.exampleProject.Redundancy.Message;

public class MessageShow extends MessageBoundary{
    
    @Override
    public CheckStatus check() {
        if(super.check() == CheckStatus.FAIL){
            return CheckStatus.FAIL;
        }
        String msg1 = "message";
        String msg2 = "message too long to read message too long to read message too long to read message too long to read message too long to read";
        if(!new Message(msg1).showMessage().equals(msg1)){
            return CheckStatus.FAIL;
        }
        if(!new Message(msg2).showMessage().equals(msg2.substring(0, 99))){
            return CheckStatus.FAIL;
        }
        return CheckStatus.PASS;
    }
}
