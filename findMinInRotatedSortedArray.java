class Solution {
    public int findMin(int[] nums) {
    
        return nums[minElement(nums)];
        
    }

    static int minElement(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid;

            }
            else if(arr[end] > arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return start;

    }
}
