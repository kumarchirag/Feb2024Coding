import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        
        System.out.println("Enter Starting Value:(start from 0)");
        int first = sc.nextInt();
         
        System.out.println("Enter Ending Value:");
        int end = sc.nextInt();
        
        String newStr ="";
          
        for(int i=first; i<end; i++){
            newStr += str.charAt(i);
        }  
        
        System.out.println(newStr);
    }
}

// Enter a String:
// Chirag Likes Cricket and Football.
// Enter Starting Value:(start from 0)
// 0
// Enter Ending Value:
// 20
// Chirag Likes Cricket
