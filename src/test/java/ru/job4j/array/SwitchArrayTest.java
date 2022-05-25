package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to1() {
        int[] input = {1, 2, 3, 4};
        int source = 2;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to4() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 3;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 5, 4};
        assertArrayEquals(expected, result);
    }
}