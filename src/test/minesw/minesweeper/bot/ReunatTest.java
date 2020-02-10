
package minesw.minesweeper.bot;

import minesweeper.bot.Reunat;
import java.util.HashSet;
import junit.framework.TestCase;
import min.minesweeper.bot.Reunat;
import minesweeper.generator.MinefieldGenerator;
import minesweeper.model.Board;
import minesweeper.model.Square;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Insanefun
 */
public class ReunatTest extends TestCase {
    private MinefieldGenerator generator;
    private Board board;
    public ReunatTest(String testName) {
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

    
    public void testMiina(){
        Reunat k = new Reunat();
        board.getSquareAt(2, 2).setMine();
        board.getSquareAt(2, 3).open();
        Square q = board.getSquareAt(2, 3);
        HashSet<Square> reunalla = k.laske(board);
        assertTrue(reunalla.contains(q));
    }
    public void testSuljettu(){
        Reunat k = new Reunat();
        board.getSquareAt(2, 2).setMine();
        board.getSquareAt(2, 3).open();
        Square q = board.getSquareAt(2, 2);
        HashSet<Square> reunalla = k.laske(board);
        assertTrue(reunalla.contains(q));
    }
    public void testSuljettuMiina(){
        Reunat k = new Reunat();
        board.getSquareAt(2, 2).setMine();
        board.getSquareAt(2, 3).open();
        board.getSquareAt(1, 1).open();
        Square q = board.getSquareAt(2, 2);
        q.toggleFlagged();
        HashSet<Square> reunalla = k.laske(board);
        assertTrue(!reunalla.contains(q));
    }
}
