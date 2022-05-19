package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01To10Then1dot41() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 1;
        int y2 = 0;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0minus1ToMinus10Then1dot41() {
        int x1 = 0;
        int y1 = -1;
        int x2 = -1;
        int y2 = 0;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23To32Then2dot23() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 0;
        int y2 = 2;
        double expected = 2.23;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}