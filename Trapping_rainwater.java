class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedwater = 0;

        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedwater += waterLevel-height[i];
        }

        return trappedwater;
    }
}

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
