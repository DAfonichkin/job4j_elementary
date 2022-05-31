package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int col = 0; col < board.length; col++) {
                if (board[row][col] != 'X') {
                    return false;
                }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            rsl[row] = board[row][row];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 'X' && (monoHorizontal(board, row) || monoVertical(board, row))) {
                return true;
            }
        }
        return false;
    }
}