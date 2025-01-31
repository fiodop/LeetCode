package data_structures;

public class UniquePaths {
    public int uniquePaths(int n, int m) {
        int[][] field = new int[n][m];
        int answ = 0;

        for(int i = n; n > -1; n--){
            for (int j = m; j > -1; j--){
                if(i == n || j == m){
                    answ ++;
                    j++;
                }

                if ()
            }
        }
    }

}
