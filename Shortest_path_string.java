import java.util.*;
import java.lang.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int x = 0;
        int y = 0;
        
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            
            if(curr == 'N'){
                y++;
            }
            else if(curr == 'S'){
                y--;
            }
            else if(curr == 'E'){
                x++;
            }
            else if(curr == 'W'){
                x--;
            }
        }
        
        int x2 = x*x;
        int y2 = y*y;
        
        float ans = (float)Math.sqrt(x2+y2);
        System.out.println(ans);
    }
}

// WNEENESENNN
// 5.0
