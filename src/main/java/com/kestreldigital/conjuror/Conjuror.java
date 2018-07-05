/*
 * Copyright 2018 Kestrel Digital Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
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

    /**
     * Generates a random name (first name and last name, separated by a space.
     *
     * @return Random full name (String).
     */
    public String conjureName() {
        return nameConjuror.conjureName();
    }

    /**
     * Generates a random first name.
     *
     * @return Random first name (String).
     */
    public String conjureFirstName() {
        return nameConjuror.conjureFirstName();
    }

    /**
     * Generates a random last name.
     *
     * @return Random last name (String).
     */
    public String conjureLastName() {
        return nameConjuror.conjureLastName();
    }

    /**
     * Generates a random string to match the supplied regular expression.
     *
     * @param regex Regular expression which the output should match (String).
     * @return Random String matching the input regex.
     */
    public String conjureString(String regex) {
        return stringConjuror.conjureFromRegex(regex);
    }

    /**
     * Generates a random date of birth for a person whose age is in the specified range
     *
     * @param maximumAge The maximum age for the person (int).
     * @param minimumAge The minimum age for the person (int).
     * @return Random Date between minimumAge and maximumAge years ago.
     */
    public Date conjureBirthDate(int maximumAge, int minimumAge) {
        return dateConjuror.conjureBirthDate(maximumAge, minimumAge);
    }
}
