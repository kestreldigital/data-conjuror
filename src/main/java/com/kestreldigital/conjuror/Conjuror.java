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
