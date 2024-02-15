class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.print("[");

        for(int i=0; i<n; i++){
            System.out.print(nums[i]);
            if(i != n-1){
                System.out.print(",");
            }
        }

        System.out.print("]");
   }
}

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
