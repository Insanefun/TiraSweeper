
package java.minesweeper.bot;

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

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    //Luo testit ympäristössä jossa komennot toimivat.
    //Toimii oikein joissain ympäristöissä, toisilla ei kompiloi.
    public void testehdota(){
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
}
