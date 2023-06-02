package com.RQCODE.exampleProject.Modifiable.BadRequirements;

import com.RQCODE.exampleProject.Modifiable.App;
import com.RQCODE.exampleProject.Modifiable.ServerAPI;

public class EstimateUpdateRequirement extends GetServerDataRequirement{
    
    public EstimateUpdateRequirement(){
        super("Use server's datetime to estemate time to an app update");
    }

    @Override
    public CheckStatus check(){
        if(super.check() == CheckStatus.FAIL) return CheckStatus.FAIL;
        Long currentTime = ServerAPI.getServerTime();
        App app = new App(currentTime + 1000);
        if(app.estimateTimeToUpdate(currentTime) != currentTime + 1000){
            return CheckStatus.FAIL;
        }
        return CheckStatus.PASS;
    }
}
