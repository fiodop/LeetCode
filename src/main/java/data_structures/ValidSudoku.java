package data_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<Integer, HashSet<Character>> boxes = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            boxes.put(i, new HashSet<>());
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (c == '.'){
                    continue;
                }
                if (board[i][j] == '.') continue;
                int boxIndex = (i / 3) * 3 + (j / 3);


                if(rows.get(i).contains(c) || cols.get(j).contains(c) || boxes.get(boxIndex).contains(c)){
                    return false;
                }


                rows.get(i).add(c);
                cols.get(j).add(c);
                boxes.get(boxIndex).add(board[i][j]);
            }
        }
        return true;
    }
}
