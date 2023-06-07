package com.RQCODE.exampleProject.Redundancy;

public class Message {
    private String msg;

    public Message(String str){
        if(str.length() > 100){
            msg = str.substring(0, 99);
        }
        else{
            msg = str;
        }
    }

    public int getSize(){
        return msg.length();
    }

    public void createNewMessage(String str){
        if(str.length() > 100){
            msg = str.substring(0, 99);
        }
        else{
            msg = str;
        }
    }
    
    public String showMessage(){
        return msg;
    }
}
