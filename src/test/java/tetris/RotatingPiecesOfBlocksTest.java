/*
 * Copyright (c) 2008-2009  Esko Luontola, www.orfjackal.net
 *
 * You may use and modify this source code freely for personal non-commercial use.
 * This source code may NOT be used as course material without prior written agreement.
 */

package tetris;

import net.orfjackal.nestedjunit.NestedJUnit4;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * @author Esko Luontola
 */
@RunWith(NestedJUnit4.class)
public class RotatingPiecesOfBlocksTest extends Assert {

    private Piece piece;


    public class A_piece_of_3x3_blocks {

        @Before
        public void createPiece() {
            piece = new Piece("" +
                    ".X.\n" +
                    ".X.\n" +
                    "...\n");
        }

        @Test
        public void consists_of_many_blocks() {
            assertEquals("" +
                    ".X.\n" +
                    ".X.\n" +
                    "...\n", piece.toString());
        }

        @Test
        public void can_be_rotated_clockwise() {
            piece = piece.rotateClockwise();
            assertEquals("" +
                    "...\n" +
                    ".XX\n" +
                    "...\n", piece.toString());
        }

        @Test
        public void can_be_rotated_counterclockwise() {
            piece = piece.rotateCounterClockwise();
            assertEquals("" +
                    "...\n" +
                    "XX.\n" +
                    "...\n", piece.toString());
        }
    }

    public class A_piece_of_5x5_blocks {

        @Before
        public void createPiece() {
            piece = new Piece("" +
                    "..XXX\n" +
                    "..XX.\n" +
                    "..X..\n" +
                    ".....\n" +
                    ".....\n");
        }

        @Test
        public void consists_of_many_blocks() {
            assertEquals("" +
                    "..XXX\n" +
                    "..XX.\n" +
                    "..X..\n" +
                    ".....\n" +
                    ".....\n", piece.toString());
        }

        @Test
        public void can_be_rotated_clockwise() {
            piece = piece.rotateClockwise();
            assertEquals("" +
                    ".....\n" +
                    ".....\n" +
                    "..XXX\n" +
                    "...XX\n" +
                    "....X\n", piece.toString());
        }

        @Test
        public void can_be_rotated_counterclockwise() {
            piece = piece.rotateCounterClockwise();
            assertEquals("" +
                    "X....\n" +
                    "XX...\n" +
                    "XXX..\n" +
                    ".....\n" +
                    ".....\n", piece.toString());
        }
    }
}
