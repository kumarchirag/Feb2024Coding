// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int [] marks = {12,23,34,45,56,67,78,89,90};
        
       int i=0;
       int j=marks.length-1;
       
       while(i<j){
           int temp=marks[i];
           marks[i]=marks[j];
           marks[j]=temp;
           i++;
           j--;
       }
       
       for(int a=0; a<marks.length; a++){
           System.out.print(marks[a]+" ");
       }
    }
}

// 90 89 78 67 56 45 34 23 12 
