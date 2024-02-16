import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Strings: ");
        int num = sc.nextInt();
        String s= sc.nextLine();
        
        String[] newstr = new String[num];
        
        for(int i=0; i<num; i++){
        System.out.println("Enter the "+i+"th String: ");
        newstr[i] = sc.nextLine();
        }
        
        String largest = newstr[0];
        
        for(int i=0; i<num; i++){
            if(largest.compareToIgnoreCase(newstr[i])<0){
                largest = newstr[i];
            }
        }
        
        System.out.println(largest);
    }
}

// Enter the number of Strings: 
// 2
// Enter the 0th String: 
// chirag
// Enter the 1th String: 
// chiraa
