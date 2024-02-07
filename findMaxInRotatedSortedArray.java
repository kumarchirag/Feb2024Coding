class Solution {
    public int findMin(int[] nums) {
    
        return nums[maxElement(nums)];
        
    }

    static int maxElement(int[] arr){
       int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + (end-start)/2;
            
            if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[start] > arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;

    }
}
