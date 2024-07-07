import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2}, {2,4,2,2}};
        System.out.println(equalPairs(grid));
    }
    public static int equalPairs(int[][] grid) {
        ArrayList<Integer> row;
        List<List<Integer>> rows = new ArrayList<>();
        for(int i = 0; i < grid.length; i++){
            row = new ArrayList<>();
            for (int j = 0; j < grid.length; j++){
                row.add(grid[i][j]);
            }
            rows.add(row);
        }
        int cnt = 0;
        ArrayList<Integer> column;
        HashMap<List<Integer>, Integer> columns = new HashMap<>();
        for(int i = 0; i < grid.length; i++){
            column = new ArrayList<>();
            for(int j = 0; j < grid.length; j++){
                column.add(grid[j][i]);
            }
            columns.put(column, columns.getOrDefault(column, 0) + 1);
        }
        for (List<Integer> n : rows){
            cnt += columns.getOrDefault(n, 0);
        }
        return cnt;
    }
}
//[3,2,1]
//[1,7,6]
//[2,7,7]