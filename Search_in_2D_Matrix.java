class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=0;
        int m = matrix[0].length-1;

        while(n<matrix.length && m>=0){
            if(matrix[n][m] == target){
                return true;
            }
            else if(target > matrix[n][m]){
                n++;
            }
            else{
                m--;
            }
        }
        return false;
    }
}

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false
