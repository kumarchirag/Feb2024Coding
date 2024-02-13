import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        
        while(num>0){
            int remainder = num%10;
            result = result*10 + remainder;
            num /= 10;
            
        }
        System.out.println(result);
        
    }
}

1234
4321
