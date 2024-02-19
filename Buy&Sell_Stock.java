public class Solution {
    public static long getMaximumProfit (int n, long[] values) {
        // Your code goes here.
        long profit=0;

    for(int i=1;i<n;i++){

        if(values[i]>values[i-1]){

            profit+=values[i]-values[i-1];

        }

    }
    return profit;
    }
}
// MOOST OPTIMUM SOLUTION

// Sample Input 1 :
// 1
// 7
// 1 2 3 4 5 6 7
// Sample Output 1 :
// 6
// Explanation :
// We can make the maximum profit by buying the stock on the first day and selling it on the last day.
// Sample Input 2 :
// 1
// 7
// 7 6 5 4 3 2 1
// Sample Output 2 :
// 0
// Explanation :
// We can make the maximum profit by not buying the stock.
