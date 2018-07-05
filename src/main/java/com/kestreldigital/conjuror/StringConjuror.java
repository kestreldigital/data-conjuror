package com.kestreldigital.conjuror;

import com.mifmif.common.regex.Generex;

class StringConjuror {

    public String conjureFromRegex(String regex) {
        Generex generex = new Generex(regex);
        return generex.random();
    }

}
