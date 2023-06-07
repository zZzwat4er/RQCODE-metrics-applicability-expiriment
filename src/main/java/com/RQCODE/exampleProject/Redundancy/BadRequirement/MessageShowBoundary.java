package com.RQCODE.exampleProject.Redundancy.BadRequirement;

import com.RQCODE.exampleProject.Redundancy.Message;

public class MessageShowBoundary extends MessageShow{
    
    @Override
    public CheckStatus check() {
        String str = "";
        Message msg = new Message(str);
        for(int i = 0; i < 120; i++){
            if(msg.showMessage().length() < 0 || msg.showMessage().length() > 100){
                return CheckStatus.FAIL;
            }
            str += 'a';
            msg = new Message(str);
        }
        return super.check();
    }
}