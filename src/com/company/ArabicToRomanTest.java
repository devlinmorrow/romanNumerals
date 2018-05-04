package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArabicToRomanTest {

    @Test
    public void converts0ToEmptyString() {
        ArabicToRoman arabicToRoman = new ArabicToRoman();
        assertEquals("", arabicToRoman.convert(0));
    }

    @Test
    public void converts1ToI() {
        ArabicToRoman arabicToRoman = new ArabicToRoman();
        assertEquals("I", arabicToRoman.convert(1));
    }

    @Test
    public void converts2ToII() {
        ArabicToRoman arabicToRoman = new ArabicToRoman();
        assertEquals("II", arabicToRoman.convert(2));
    }
}