// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {33,22,11,9,7,6,4,2,1,0};
        int result = bitonicArrayPeakElement(arr);
        if(result ==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(" "+result+" "+arr[result]);
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
}
