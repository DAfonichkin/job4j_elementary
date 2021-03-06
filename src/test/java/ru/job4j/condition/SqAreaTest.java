package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K5Square3dot47() {
        double expected = 3.47;
        int p = 10;
        double k = 5;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP15K3Square10dot54() {
        double expected = 10.54;
        int p = 15;
        double k = 3;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}