import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                System.out.print("Composite");
                count++;
                break;
            }
        }
        if(count==0){
        System.out.println("Prime");
        }
    }
}
