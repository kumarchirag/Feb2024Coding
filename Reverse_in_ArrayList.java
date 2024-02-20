import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        
        int first = 0;
        int last = list.size()-1;
        
        while(first<last){
           
           int temp=list.get(first);
            first = list.get(last);
            last = list.get(first);
           
            first++;
            last--;
        }
        System.out.print(list);
    }
}

// java -cp /tmp/drcO8hKHmr HelloWorld
// [9, 8, 7, 6, 5, 4, 3, 2, 1]
