package java.minesweeper.bot;

import java.util.HashSet;
import java.util.Set;
import minesweeper.model.Board;
import minesweeper.model.Square;
/**
*@author Insanefun
*/
public class Reunat {
    /**
     * Find open squares with adjacent mines
     * @param board The current board and state of chosen board
     * @return HashSet containing all the found open squares with an adjacent mine
     */
    public HashSet<Square> laske(Board board){
        HashSet<Square> avatut = board.getOpenSquares();
        HashSet<Square> reunalla = new HashSet<Square>();
        for(Square sq : avatut){
            int flagged = 0;
            for (int i = -1; i <= 1; i++){
            for (int o = -1; o <= 1; o++) {
                if (i == 0 && o == 0) {

                } else {
                    if (board.withinBoard(sq.getX() + i, sq.getY() + o)) {
                        Square a = board.getSquareAt(sq.getX() + i, sq.getY() + o);
                        if (a.isFlagged()) {
                            flagged++;
                        }
                    }
                }
            }
            }
            int q = sq.surroundingMines() - flagged;
            if(q != 0){
                reunalla.add(sq);
            }
        }
        return reunalla;
    }
    /**
    *Return set of closed squares that are next to open squares. 
     */
     //wip
    public HashSet<Square> laskeu(Board board){
        HashSet<Square> avatut = board.getOpenSquares();
        HashSet<Square> reunallau = new HashSet<Square>();
         for(Square sq : avatut){
            int flagged = 0;
            for (int i = -1; i <= 1; i++){
            for (int o = -1; o <= 1; o++) {
                if (i == 0 && o == 0) {

                } else {
                    if (board.withinBoard(sq.getX() + i, sq.getY() + o)) {
                        Square a = board.getSquareAt(sq.getX() + i, sq.getY() + o);
                        if (!a.isOpened()) {
                            reunallau.add(a);
                        }
                    }
                }
            }
            }
            
            if(q != 0){
                reunallau.add(sq);
            }
        }

        
        return reunallau;
    }
}