package com.RQCODE.exampleProject.Reuse.BadRequirement;

import com.RQCODE.exampleProject.Reuse.Item;

import rqcode.concepts.Requirement;

public class ItemFields extends Requirement{

    public ItemFields() {
        super("The item has title and price");
    }

    @Override
    public CheckStatus check() {
        Item item = new Item("asdf", 0);
        if(item.price == 0 && item.title == "asdf"){
            return CheckStatus.PASS;
        }
        return CheckStatus.FAIL;
    }
    
}
