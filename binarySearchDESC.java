// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1,0};
        int res = binarySearchDESC(arr,0,arr.length-1,0);
        System.out.print(res);
    }
    
    static int binarySearchDESC(int[] arr,int start, int end, int target){
        int ans = -1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
        
    }
}
