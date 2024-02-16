
import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int left = 0;
        int right = str.length()-1;
        boolean isTrue = true;
        
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                isTrue = false;
                break;
            }
            left++;
            right--;
        }
        
        if(isTrue == true){
        System.out.print("Yes, it is palindrome");
        }else{
        System.out.print("No, it is not palindrome");
        }
    }
}

// racecar
// Yes, it is palindrome
