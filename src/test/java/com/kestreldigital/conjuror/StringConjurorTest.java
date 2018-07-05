package com.kestreldigital.conjuror;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringConjurorTest {

    private StringConjuror stringConjuror;

    @Before
    public void setUp() {
        stringConjuror = new StringConjuror();
    }

    @Test
    public void stringCanBeGeneratedFromRegex() {
        // Given
        String regex = "[A-Z][0-9]{7}[a-z0-9]";

        // When
        String generatedString = stringConjuror.conjureFromRegex(regex);

        // Then
        assertTrue(generatedString.matches(regex));
    }

}