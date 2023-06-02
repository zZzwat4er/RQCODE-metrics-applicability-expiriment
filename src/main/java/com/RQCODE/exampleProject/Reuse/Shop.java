package com.RQCODE.exampleProject.Reuse;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Item> items;

    public Shop(){
        items = new ArrayList<Item>();
    }

    public Shop(List<Item> items){
        items = new ArrayList<Item>(items);
    }
    
    public void addItem(Item item){
        items.add(item);
    }
}
