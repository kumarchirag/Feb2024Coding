class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder("");

        for(int i=str.length-1; i>=0; i--){
            if(str[i].length==0){
                continue;
            }
            if(sb.length()==0){
                sb.append(str[i]);
            }
            else{
                sb.append(" ");
                sb.append(str[i]);
            }
        }

        return sb.toString();
    }
}


// Example 1:

// Input:a = geeksforgeeks, b = forgeeksgeeks
// Output: YES
// Explanation: Both the string have same characters with
//         same frequency. So, both are anagrams.
// Example 2:

// Input:a = allergy, b = allergic
// Output: NO
// Explanation: Characters in both the strings are 
//         not same, so they are not anagrams.
