
package minesweeper.bot;

import minesweeper.model.Board;
import minesweeper.model.Square;

/**
 *
 * @author Insanefun
 */
public class ValitseTutki(Board board) {
    //x*y matriisi jossa kaikki arvot 0
    public int[][] kent = new int[board.width][board.height];

    /**
     * Set known mine locations and known safe locations
     * @param x x parameter of the square
     * @param y y parameter of the square
     * @param signal known likelyhood of square being safe.
     */
    public void asetaArvo(int x, int y, int signal){
        if(signal > 0){
            kent[x-1][y-1] = 1;
        }
        if(signal < 0){
            kent[x-1][y-1] = -1;
        }
    }
}