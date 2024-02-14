// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int [] marks = {12,23,34,45,56,67,78,89,90};
        int max = marks[0];
        int min = marks[0];
        
        for(int i=1; i<marks.length; i++){
            if(max<marks[i]){
                max = marks[i];
            }    
            if(min>marks[i]){
                min = marks[i];
            }
        }
        
        System.out.println("Maximun number is: "+max);
        System.out.print("Minimun number is: "+min);
    }
}

// Maximun number is: 90
// Minimun number is: 12
