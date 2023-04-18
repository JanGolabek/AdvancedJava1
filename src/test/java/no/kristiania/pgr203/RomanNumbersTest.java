package no.kristiania.pgr203;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {
    @Test
    void convert1ToRoman() {
        assertEquals("I", RomanNumbers.toRoman(1));
    }

    @Test
    void convert3ToRoman() {
        assertEquals("III", RomanNumbers.toRoman(3));
    }

    @Test
    void convert4ToRoman() {
        assertEquals("IV", RomanNumbers.toRoman(4));
    }

    @Test
    void convert5ToRoman() {assertEquals("V", RomanNumbers.toRoman(5)); }

    @Test
    void convert9ToRoman() {
        assertEquals("IX", RomanNumbers.toRoman(9));
    }

    @Test
    void convertNegativeToRoman() {
        assertEquals("Invalid number. Please try again.", RomanNumbers.toRoman(-2));
    }

    @Test
    void convert4000ToRoman() {
        assertEquals("Invalid number. Please try again.", RomanNumbers.toRoman(4000));
    }
}


