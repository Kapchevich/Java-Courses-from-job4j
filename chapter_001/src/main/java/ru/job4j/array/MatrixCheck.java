package ru.job4j.array;

import java.util.Arrays;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            int a = 0;
            int b = 0;
            if (board[i][i] == 'X') {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 'X') {
                        a++;
                    }
                    if (a == board.length) {
                        result = true;
                    }
                    if (board[j][i] == 'X') {
                        b++;
                    }
                    if (b == board.length) {
                        result = true;
                    }
                }
            }
        } return result;
    }
}


