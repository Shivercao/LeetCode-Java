/**
 * Created by shivercao on 2/9/2018.
 */
import java.util.HashSet;

public class Sudoku_Checker {
    public boolean isValidSudoku(int[][] partialAssignment) {
        // 1. 1-9 only appear once for each row and column
        // 2. 1-9 only appears once in each 3*3 subcubes
        //check duplicate in rows and columns
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            HashSet<Character> subcube = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // 1. 1-9 only appear once for each row and column
                if (!row.add((char) partialAssignment[i][j]) && (char) partialAssignment[i][j]!= '0') {
                    return false;
                }
                if (!column.add((char) partialAssignment[j][i]) && ((char) partialAssignment[j][i]) != '0') {
                    return false;
                }
                // 2. 1-9 only appears once in each 3*3 subcubes
                int cubeRow = 3 * (i / 3) + j / 3;
                int cubeCol = 3 * (i % 3) + j % 3;
                if (partialAssignment[cubeRow][cubeCol] != '0' && !subcube.add((char) partialAssignment[cubeRow][cubeCol])) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] sudoko1 = {{5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}};

        Sudoku_Checker s1 = new Sudoku_Checker();
        System.out.println(s1.isValidSudoku(sudoko1));
    }
}

