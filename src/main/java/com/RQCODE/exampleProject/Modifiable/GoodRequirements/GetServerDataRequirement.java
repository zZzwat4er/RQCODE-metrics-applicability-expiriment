package com.RQCODE.exampleProject.Modifiable.GoodRequirements;

import com.RQCODE.exampleProject.Modifiable.ServerAPI;

import rqcode.concepts.Requirement;

public class GetServerDataRequirement extends Requirement {

    public GetServerDataRequirement() {
        super("Resive Server datetime");
    }

    public GetServerDataRequirement(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Long time = ServerAPI.getServerTime();
        if (time == null) {
            return CheckStatus.FAIL;
        }
        return CheckStatus.PASS;
    }
}
