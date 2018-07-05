package com.kestreldigital.conjuror;

import java.util.Date;

class DateConjuror {

    Date conjureBirthDate(int maximumAge, int minimumAge) {
        long minimumEpochOffset = Math.round(minimumAge * 365.25 * 24 * 60 * 60 * 1000);
        long maximumEpochOffset = Math.round(maximumAge * 365.25 * 24 * 60 * 60 * 1000);
        long epochOffset = minimumEpochOffset + Math.round(Math.random() * (maximumEpochOffset - minimumEpochOffset));
        return new Date(System.currentTimeMillis() - epochOffset);
    }

}
