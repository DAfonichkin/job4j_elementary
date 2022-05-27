package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == row && board[i][j] != board[i][0]) {
                    return false;
                }
            }
        }
        return true;
    }

}