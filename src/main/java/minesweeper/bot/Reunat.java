


package java.minesweeper.bot;

import minesweeper.model.Board;
import minesweeper.model.Square;
/**
*@author Insanefun
*/
public class Reunat() {
    public HashSet<Square> laske(Board board){
        HashSet<Square> avatut = board.getOpenSquares;
        Set<Square> reunalla = new HashSet<Square>();
        for(Square sq : avatut){
            int flagged = 0;
            for (int o = -1; o <= 1; o++) {
                if (i == 0 && o == 0) {

                } else {
                    if (board.withinBoard(x + i, y + o)) {
                        Square a = board.getSquareAt(x + i, y + o);
                        if (a.isFlagged()) {
                            flagged++;
                        }
                    }
                }
            }
            int q = sq.surroundingMines - flagged;
            if(q != 0){
                reunalla.add(sq);
            }
        }
    }

}