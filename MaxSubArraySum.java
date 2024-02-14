import java.util.*;
public class MyClass {
    static int maxSubArraySum(int arr[], int size) {
     int max_so_far = Integer.MIN_VALUE, 
        max_ending_here = 0;
        
        for (int i = 0; i < size; i++) {
        
            max_ending_here = max_ending_here + arr[i];
        
            if (max_so_far < max_ending_here)
        
                max_so_far = max_ending_here;
        
            if (max_ending_here < 0)
        
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static void main(String args[]) {
        int [] arr = {-1,-2,-3,-4,-5,-6,4};
        int max = maxSubArraySum(arr,arr.length);
        System.out.print(max);
    }
    
}

//4
