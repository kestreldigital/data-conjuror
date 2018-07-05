package com.kestreldigital.conjuror;

import com.kestreldigital.conjuror.utils.RandomUtils;
import com.kestreldigital.conjuror.utils.ResourceUtils;

import java.util.List;

class NameConjuror {

    private List<String> firstNames;
    private List<String> lastNames;

    private RandomUtils randomUtils;

    NameConjuror() {
        randomUtils = new RandomUtils();
        ResourceUtils resourceUtils = new ResourceUtils();
        firstNames = resourceUtils.readResourceToStringList("/names/firstNames.txt");
        lastNames = resourceUtils.readResourceToStringList("/names/lastNames.txt");
    }

    String conjureName() {
        return conjureFirstName() + " " + conjureLastName();
    }

    String conjureFirstName() {
        return firstNames.get(randomUtils.getListIndex(firstNames));
    }

    String conjureLastName() {
        return lastNames.get(randomUtils.getListIndex(lastNames));
    }

}
