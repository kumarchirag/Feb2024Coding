// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int [] marks = {12,23,34,45,56,67,78,89,90};
        
        for(int i=0; i<marks.length; i++){
            for(int j=i+1; j<marks.length; j++){
                System.out.print("("+marks[i]+","+marks[j]+")"+" ");
            }
            System.out.println();
        }   
     
    }
}

// (12,23) (12,34) (12,45) (12,56) (12,67) (12,78) (12,89) (12,90) 
// (23,34) (23,45) (23,56) (23,67) (23,78) (23,89) (23,90) 
// (34,45) (34,56) (34,67) (34,78) (34,89) (34,90) 
// (45,56) (45,67) (45,78) (45,89) (45,90) 
// (56,67) (56,78) (56,89) (56,90) 
// (67,78) (67,89) (67,90) 
// (78,89) (78,90) 
// (89,90)
