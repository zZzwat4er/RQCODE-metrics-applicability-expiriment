package com.RQCODE.exampleProject.Reuse.BadRequirement;

import com.RQCODE.exampleProject.Reuse.Item;
import com.RQCODE.exampleProject.Reuse.Shop;

public class ItemAddition extends ItemList{
    private ItemFields itemFieldRequirement;

    public ItemAddition(ItemFields itemFieldRequiirement){
        super("User can add a custom item to the list from R1 for theyself");
        this.itemFieldRequirement = itemFieldRequiirement;
    }

    @Override
    public CheckStatus check(){
        if(super.check() == CheckStatus.FAIL){
            return CheckStatus.FAIL;
        }
        if(itemFieldRequirement.check() == CheckStatus.FAIL){
            return CheckStatus.FAIL;
        }
        Shop shop = new Shop();
        Item item = new Item("test", 1);
        shop.addItem(item);
        int listLength = shop.items.size();
        if(shop.items.get(listLength - 1) == item){
            return CheckStatus.PASS;
        }
        return CheckStatus.FAIL;
    }
    
}
