// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,8,6,4,2,0};
        int target = 7;
        int count = 0;
        int index = bitonicArrayPeakElement(arr);
        if(index == -1){
            count=1;
            System.out.println("Element not found");
        }
        else if(arr[index] == target){
            count=1;
            System.out.println("Element found at: "+index);
        }
        else if(arr[index]>target){
            int newIndex = binarySearchASC(arr,0,index-1,target);
            if(newIndex != -1){
                count=1;
                System.out.println("Element found at: "+newIndex);
            }
            
        }
        else if(arr[index]>target){
            int newIndex = binarySearchDESC(arr,index+1, arr.length-1,target);
            if(newIndex !=-1){
                count=1;
                System.out.println("Element found at: "+newIndex);
            }
        }
        if(count==0){
            System.out.println("Element not found");
        }
        
        
    }
    
     static int bitonicArrayPeakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start<= end){
            int mid = start + (end-start)/2;
            int prev = (mid-1+arr.length)%arr.length;
            int hih = (mid+1)%arr.length;
            
            if(arr[mid]>arr[prev] && arr[mid]>arr[hih]){
                return mid;
            }
            else if(arr[mid]>arr[prev]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
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
