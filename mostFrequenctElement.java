import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
       int[] arr = {1,1,2,2,3,3,4,4,4,5};
       int ans = mostFrequenctElement(arr);
       System.out.println("Ans is : "+ans);
    }
    
    static int mostFrequenctElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int freq = 0;
        int ans = -1;
        
        for(int i =0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
            if(map.get(arr[i])>freq){
                ans = arr[i];
                freq = map.get(arr[i]);
            }
            
        }
        return ans;
    }
}

// Ans is : 4
