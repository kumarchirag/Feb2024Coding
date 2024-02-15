class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        List<Integer> ans = new ArrayList<>();
        int m = matrix[0].length;

        int startrow = 0;
        int endrow = n-1;
        int startcol = 0;
        int endcol = m-1;

        while(startrow <= endrow && startcol <= endcol){
            
            for(int i=startcol; i<=endcol; i++){
               ans.add( matrix[startrow][i]);
            }

            for(int j =startrow+1; j<=endrow; j++){
               ans.add( matrix[j][endcol]);
            }

            for(int k = endcol-1; k>=startcol; k--){
                if(startrow == endrow){
                    break;
                }
               ans.add( matrix[endrow][k]);
            }

            for(int l=endrow-1; l>=startrow+1; l--){
                if(startcol == endcol){
                    break;
                }
                ans.add(matrix[l][startcol]);
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;

        }
        return ans;
        
    }
}

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]
