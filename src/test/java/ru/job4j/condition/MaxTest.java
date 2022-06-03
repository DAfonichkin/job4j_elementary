package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To1Then5() {
        int left = 5;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1To1Then1() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To5To1Then10() {
        int first = 10;
        int second = 5;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To10To1Then10() {
        int first = 5;
        int second = 10;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To1To10Then10() {
        int first = 5;
        int second = 1;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1To1To1Then1() {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To5To1To1Then10() {
        int first = 10;
        int second = 5;
        int third = 1;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To10To1To15Then15() {
        int first = 5;
        int second = 10;
        int third = 1;
        int fourth = 15;
        int result = Max.max(first, second, third, fourth);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To1To10To1Then15() {
        int first = 5;
        int second = 15;
        int third = 10;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }
}