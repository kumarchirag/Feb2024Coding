public class MyClass {
    public static void main(String args[]) {
     
        int [] marks = {12,23,34,45,56,67,78,89,90};
        
        for(int i=0; i<marks.length; i++){
            
            for(int j=i; j<marks.length; j++){
                
                for(int k=i; k<=j; k++){
                    System.out.print(marks[k]+" ");
                }
                 System.out.print("\n");
            }
            System.out.print("\n");
        } 
    }
}

// 12 
// 12 23 
// 12 23 34 
// 12 23 34 45 
// 12 23 34 45 56 
// 12 23 34 45 56 67 
// 12 23 34 45 56 67 78 
// 12 23 34 45 56 67 78 89 
// 12 23 34 45 56 67 78 89 90 

// 23 
// 23 34 
// 23 34 45 
// 23 34 45 56 
// 23 34 45 56 67 
// 23 34 45 56 67 78 
// 23 34 45 56 67 78 89 
// 23 34 45 56 67 78 89 90 

// 34 
// 34 45 
// 34 45 56 
// 34 45 56 67 
// 34 45 56 67 78 
// 34 45 56 67 78 89 
// 34 45 56 67 78 89 90 

// 45 
// 45 56 
// 45 56 67 
// 45 56 67 78 
// 45 56 67 78 89 
// 45 56 67 78 89 90 

// 56 
// 56 67 
// 56 67 78 
// 56 67 78 89 
// 56 67 78 89 90 

// 67 
// 67 78 
// 67 78 89 
// 67 78 89 90 

// 78 
// 78 89 
// 78 89 90 

// 89 
// 89 90 

// 90 

