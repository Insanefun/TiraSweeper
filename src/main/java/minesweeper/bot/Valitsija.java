/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.minesweeper.bot;

import minesweeper.model.Board;
import minesweeper.model.Square;

/**
 *
 * @author Insanefun
 */
public class Valitsija {

    /**
     * Choose an action based on surrounding board
     *
     * @param board The current board state
     * @param x x cordinate of the unopened and unflagged square
     * @param y y cordinate of the unopened and unflagged square
     * @return Signal for change to be made onto the board
     */
    public int ehdota(int x, int y, Board board) {
        int signal = 0;
        //change to x
        for (int i = -1; i <= 1; i++) {
            //change to y
            for (int o = -1; o <= 1; o++) {
                if (i == 0 && o == 0) {

                } else {
                    if (board.withinBoard(x + i, y + o)) {
                        if (board.getSquareAt(x + i, y + o).isOpened()) {
                            signal += ehdotus(x, y, board);
                        }
                    }
                }
            }
        }
        return signal;
    }

    /**
     * Choose an action based on surrounding board
     *
     * @param board The current board state
     * @param x x cordinate of the opened square
     * @param y y cordinate of the opened square
     * @return Signal for recommended change to be made onto the board
     */
    public int ehdotus(int x, int y, Board board) {
        Square sq = board.getSquareAt(x, y);
        int mines = sq.surroundingMines();
        int flagged = 0;
        int unopened = 0;
        //change to x
        for (int i = -1; i <= 1; i++) {
            //change to y
            for (int o = -1; o <= 1; o++) {
                if (i == 0 && o == 0) {

                } else {
                    if (board.withinBoard(x + i, y + o)) {
                        Square a = board.getSquareAt(x + i, y + o);
                        if (a.isFlagged()) {
                            flagged++;
                        }
                        if (!a.isOpened()) {
                            unopened++;
                        }
                    }
                }
            }
        }
        //If there are more flags than mines some error has already happened but trust the player.
        if (flagged >= mines) {
            return 10;
        } else if (mines == unopened) {
            return -10;
        }
        return 0;
    }
}
