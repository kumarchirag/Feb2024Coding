// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int res = binarySearchASC(arr,0,arr.length-1,2);
        System.out.print(res);
    }
    
    static int binarySearchASC(int[] arr,int start, int end, int target){
        int ans = -1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
        
    }
}
