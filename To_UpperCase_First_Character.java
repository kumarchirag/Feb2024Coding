import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(Character.toUpperCase(ch));
        
        for(int i=1; i<str.length(); i++){
            
            if(str.charAt(i) ==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        
        System.out.println(sb.toString());
        
    }
}

// Enter the String: 
// chirag is a nice boy.
// Chirag Is A Nice Boy.
