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

    public static boolean monoVertical(char[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == column && board[i][j] != board[0][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}