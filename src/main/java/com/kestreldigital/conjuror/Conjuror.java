package com.kestreldigital.conjuror;

import java.util.Date;

public class Conjuror {

    private NameConjuror nameConjuror;
    private StringConjuror stringConjuror;
    private DateConjuror dateConjuror;

    public Conjuror() {
        nameConjuror = new NameConjuror();
        stringConjuror = new StringConjuror();
        dateConjuror = new DateConjuror();
    }

    public String conjureName() {
        return nameConjuror.conjureName();
    }

    public String conjureFirstName() {
        return nameConjuror.conjureFirstName();
    }

    public String conjureLastName() {
        return nameConjuror.conjureLastName();
    }

    public String conjureString(String regex) {
        return stringConjuror.conjureFromRegex(regex);
    }

    public Date conjureBirthDate(int maximumAge, int minimumAge) {
        return dateConjuror.conjureBirthDate(maximumAge, minimumAge);
    }
}
