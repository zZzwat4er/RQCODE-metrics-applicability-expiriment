package com.RQCODE.exampleProject.Modifiable.GoodRequirements;

import com.RQCODE.exampleProject.Modifiable.Translator;

import rqcode.concepts.Requirement;

public class DataTranslationRequirament extends Requirement {

    public DataTranslationRequirament() {
        super("Translate server's datetime to local");
    }

    public DataTranslationRequirament(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        long initTime = 10000;
        long targetTime = 9000;
        Translator translator = new Translator(-1000);
        if (translator.convert(initTime) != targetTime) {
            return CheckStatus.FAIL;
        }
        return CheckStatus.PASS;
    }
}
