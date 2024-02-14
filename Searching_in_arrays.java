// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int [] marks ={12,23,45,67,78,90};
        int nums= 78;
        
        for(int i=0; i<marks.length; i++){
            if(nums == marks[i]){
                System.out.print("element found at "+i+" index");
            }
        }
    }
}

//element found at 4 index
