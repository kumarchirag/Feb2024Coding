class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int a=0;
        int b=n-1;
        int c=0;


        for(int i=0; i<n; i++){
            sum += mat[a][a];

            if(c!=b){
                sum += mat[c][b];
            }

            a++;
            c++;
            b--;

        }
        return sum;
        
    }
}

// Example 2:

// Input: mat = [[1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1]]
// Output: 8
// Example 3:

// Input: mat = [[5]]
// Output: 5
