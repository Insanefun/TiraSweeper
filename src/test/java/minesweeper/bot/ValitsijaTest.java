
package minesweeper.bot;

import junit.framework.TestCase;
import minesweeper.generator.MinefieldGenerator;
import minesweeper.model.Board;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Insanefun
 */
public class ValitsijaTest extends TestCase {
    private MinefieldGenerator generator;
    private Board board;
    public ValitsijaTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        this.generator = new MinefieldGenerator();
        this.board = new Board(generator, 5, 5, 0);
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    
    //Luo testit ympäristössä jossa komennot toimivat.
    //Toimii oikein joissain ympäristöissä, toisilla ei kompiloi.
    public void testEhdota(){
        Valitsija k = new Valitsija();
        board.getSquareAt(2, 2).setMine();
        board.getSquareAt(2, 4).setMine();
        board.getSquareAt(5, 3).setMine();
        board.getSquareAt(5, 5).setMine();
        board.getSquareAt(1, 1).open();
        board.getSquareAt(1, 2).open();
        board.getSquareAt(2, 1);
        int negat = k.ehdotus(1, 1, board);
        assertTrue(negat < 0);
    }
    //jos rajatapaukset muuttuvat voi muuttua
    public void testEhdotNul(){
        Valitsija k = new Valitsija();
        board.getSquareAt(2, 2).setMine();
        board.getSquareAt(2, 4).setMine();
        board.getSquareAt(5, 3).setMine();
        board.getSquareAt(5, 5).setMine();
        board.getSquareAt(1, 2).open();
        board.getSquareAt(2, 1);
        int nolla = k.ehdota(1, 1, board);
        assertTrue(nolla == 0);
    }
    public void testEhdotPos(){
        Valitsija k = new Valitsija();
        board.getSquareAt(5, 5).setMine();
        board.getSquareAt(1, 1).open();
        int pos = k.ehdota(1, 1, board);
        assertTrue(pos > 0);
    }
    public void testEhdota2(){
        Valitsija k = new Valitsija();
        board.getSquareAt(3, 3).setMine();
        board.getSquareAt(2, 2).open();
        board.getSquareAt(2, 3).open();
        board.getSquareAt(2, 4).open();
        board.getSquareAt(3, 2).open();
        board.getSquareAt(3, 4).open();
        board.getSquareAt(4, 2).open();
        board.getSquareAt(4, 3).open();
        board.getSquareAt(4, 4).open();
        board.getSquareAt(2, 5).open();
        board.getSquareAt(3, 5).open();
        board.getSquareAt(4, 5).open();
        board.getSquareAt(5, 5).open();
        int t = k.ehdota(3, 3, board);
        assertTrue(t < 0);
    }
}
