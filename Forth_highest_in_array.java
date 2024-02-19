public class Solution 
{    
    public static int getFourthLargest(int[] arr) 
    {
        // Your code goes here
          if (arr.length < 4) {
            return Integer.MIN_VALUE;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int fourth = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                fourth = third;
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] <= first) {
                fourth = third;
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] <= second) {
                fourth = third;
                third = arr[i];
            } else if (arr[i] > fourth && arr[i] <= third) {
                fourth = arr[i];
            }
        }

        return fourth;
    }
}

// Sample Input 1:
// 5
// 3 5 1 3 1
// Sample Output 1:
// 1
// Explanation Of Sample Input 1:
// 5 is the largest element, 3 is the second-largest element, again we have a 3 so it's the third largest and 1 is the fourth-largest, hence the answer 1.
// Sample Input 2:
// 4
// 9 9 9 9
// Sample Output 2:
// 9
