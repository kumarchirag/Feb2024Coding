class Solution {
    public boolean isPalindrome(String s) {

        if(s.isEmpty()){
            return true;
        }
      

        int left = 0;
        int right = s.length()-1;
        
        while(left<=right){
            char currleft = s.charAt(left);
            char currright = s.charAt(right);

            if(!Character.isLetterOrDigit(currleft)){
                left++;
            }
            else if(!Character.isLetterOrDigit(currright)){
                right--;
            }else {
                if(Character.toLowerCase(currleft) != Character.toLowerCase(currright)){
                return false;
                }
                right--;
                left++;
            }

            
        }

        return true;
    }
}


// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
