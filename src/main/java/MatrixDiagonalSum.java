public class MatrixDiagonalSum {

        public int diagonalSum(int[][] mat) {
            int sum = 0;
            int j = mat.length - 1;
            int f = 0;

            for(int i = 0; i < mat.length; i++){
                sum+= mat[i][f] + mat[j][f];
                if(mat.length % 2 !=0 && i == j){
                    sum -= mat[i][f];
                }
                f++;
                j--;
            }
            return sum;
        }
}
