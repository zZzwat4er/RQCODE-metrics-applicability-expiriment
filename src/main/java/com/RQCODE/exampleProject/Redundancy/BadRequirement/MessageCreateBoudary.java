package com.RQCODE.exampleProject.Redundancy.BadRequirement;

import com.RQCODE.exampleProject.Redundancy.Message;

public class MessageCreateBoudary extends MessageCreate{
    
    @Override
    public CheckStatus check() {
        String str = "";
        Message msg = new Message(str);
        for(int i = 0; i < 120; i++){
            if(msg.getSize() < 0 || msg.getSize() > 100){
                return CheckStatus.FAIL;
            }
            str += 'a';
            msg.createNewMessage(str);;
        }
        return super.check();
    }
}
