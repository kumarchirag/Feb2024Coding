class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long,Integer> map = new HashMap<>();
        
        for(long i:a1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(long i:a2){
            if(map.containsKey(i) && map.get(i)>0){
               map.put(i, map.get(i)-1);
            }
            else{
                return "No";
            }
        }
        
        return "Yes";
        
        
    }
}

// Example 1:

// Input:
// a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
// a2[] = {11, 3, 7, 1, 7}
// Output:
// Yes
// Explanation:
// a2[] is a subset of a1[]

// Example 2:

// Input:
// a1[] = {1, 2, 3, 4, 4, 5, 6}
// a2[] = {1, 2, 4}
// Output:
// Yes
// Explanation:
// a2[] is a subset of a1[]

// Example 3:

// Input:
// a1[] = {10, 5, 2, 23, 19}
// a2[] = {19, 5, 3}
// Output:
// No
// Explanation:
// a2[] is not a subset of a1[]
