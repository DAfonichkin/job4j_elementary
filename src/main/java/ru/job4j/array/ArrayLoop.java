package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] indexArray = new int[5];
        for (int index = 0; index < indexArray.length; index++) {
            indexArray[index] = index * 2 + 3;
        }
        for (int arrayElement : indexArray) {
            System.out.println(arrayElement);
        }

    }
}
