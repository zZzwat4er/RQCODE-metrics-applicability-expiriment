package com.RQCODE.exampleProject.Reuse.GoodRequirement;

import com.RQCODE.exampleProject.Reuse.PurchaiseHandler;

import rqcode.concepts.Requirement;

public class Pourchice extends Requirement {

    public Pourchice() {
        super("User can make an payment with credid card by providing its data");
    }

    @Override
    public CheckStatus check() {
        if (PurchaiseHandler.purchase(10,
                "0000 0000 0000 0000",
                "000",
                "01/01",
                "Jane Dou")) {
            return CheckStatus.PASS;
        }
        return CheckStatus.FAIL;
    }
}
