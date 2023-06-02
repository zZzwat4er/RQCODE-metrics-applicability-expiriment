package com.RQCODE.exampleProject.Reuse.BadRequirement;

import java.util.Arrays;

import com.RQCODE.exampleProject.Reuse.Item;
import com.RQCODE.exampleProject.Reuse.Shop;

import rqcode.concepts.Requirement;

public class ItemList extends Requirement {

    public ItemList() {
        super("There is a list of items user can buy");
    }

    public ItemList(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Item testItem1 = new Item(
                "title1",
                10);
        Item testItem2 = new Item(
                "title2",
                5);
        Shop shop = new Shop(Arrays.asList(testItem1, testItem2));
        if (shop.items.get(0) == testItem1 && shop.items.get(1) == testItem2) {
            return CheckStatus.PASS;
        }
        return CheckStatus.FAIL;
    }

}
