package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isNotValid(x1) || isNotValid(x2)
                || isNotValid(y1) || isNotValid(y2)) {
            return rsl;
        }
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean isNotValid(int coordinate) {
        return !isValid(coordinate);
    }
}