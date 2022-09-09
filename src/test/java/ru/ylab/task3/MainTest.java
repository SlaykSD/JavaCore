package ru.ylab.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.ylab.task3.Main.fuzzySearch;

class MainTest {

    @Test
    void fuzzySearchTest() {
        String dataSearchSet1 = "jdbc";
        String dataVerifiable = "   nsetJjjjasjdbodc";
        assertTrue(fuzzySearch(dataSearchSet1, dataVerifiable));
        dataVerifiable = "   nsetJjjjasjdbod       c";
        assertTrue(fuzzySearch(dataSearchSet1, dataVerifiable));
        dataVerifiable = "   nsetJjjjasjdbod       ";
        assertFalse(fuzzySearch(dataSearchSet1, dataVerifiable));
        dataVerifiable = null;
        assertFalse(fuzzySearch(dataSearchSet1, dataVerifiable));
        assertFalse(fuzzySearch(null, dataVerifiable));
    }
}