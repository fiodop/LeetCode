public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int j = matrix[0].length - 1;
        int i = 0;
        while (i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            if(matrix[i][j] > target){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
