package com.kestreldigital.conjuror;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NameConjurorTest {

    private NameConjuror nameConjuror;

    @Before
    public void setUp() {
        nameConjuror = new NameConjuror();
    }

    @Test
    public void nameCanbeConjured() {
        // When
        String name = nameConjuror.conjureName();

        // Then
        assertFalse(StringUtils.isEmpty(name));
        assertTrue(name.matches("^[A-Z][^ ]* [a-zA-Z ]*"));
    }

}