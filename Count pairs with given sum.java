class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int res=0;
        
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i=0; i<n; i++){
            
            if(arr[i]>k){
                continue;
            }
            
            
            int key = k-arr[i];
            if(map.getOrDefault(key,0)>0){
                //res+=1;
                res +=map.get(key);
                map.put(arr[i],map.get(arr[i])-1);
            }
            
            if(arr[i]==key){
                res -=1;
            }
        }
        
        return res;
    }
}

// Example 1:

// Input:
// N = 4, K = 6
// arr[] = {1, 5, 7, 1}
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.

// Example 2:

// Input:
// N = 4, K = 2
// arr[] = {1, 1, 1, 1}
// Output: 6
// Explanation: 
// Each 1 will produce sum 2 with any 1.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function getPairsCount() which takes arr[], n and k as input parameters and returns the number of pairs that have sum K.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 <= N <= 105
// 1 <= K <= 108
// 1 <= Arr[i] <= 106
