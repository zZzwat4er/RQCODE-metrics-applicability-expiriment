package com.RQCODE.exampleProject.Modifiable.GoodRequirements;

import com.RQCODE.exampleProject.Modifiable.App;
import com.RQCODE.exampleProject.Modifiable.ServerAPI;
import com.RQCODE.exampleProject.Modifiable.Translator;

public class EstimateUpdateRequirement extends DataTranslationRequirament{
    
    public EstimateUpdateRequirement() {
        super("Use translated datetime to estemate time to an app update");
    }

    @Override
    public CheckStatus check(){
        if(super.check() == CheckStatus.FAIL) return CheckStatus.FAIL;
        Long currentTime = ServerAPI.getServerTime();
        Translator translator = new Translator(1000);
        Long localTime = translator.convert(currentTime);
        App app = new App(localTime + 1000);
        if(app.estimateTimeToUpdate(localTime) != 1000){
            return CheckStatus.FAIL;
        }
        return CheckStatus.PASS;
    }
}
