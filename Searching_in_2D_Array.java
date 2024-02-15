import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of row: ");
        int n = sc.nextInt();
        System.out.println("Enter the no. of column: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        
        System.out.println("Enter elements in array ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter element you want to search: ");
        int key = sc.nextInt();
        boolean present = false;
        
         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    present = true;
                }
            }
        }
        
        if(present == true){
            System.out.println("Element present ");
        }else{
            System.out.println("Element not present ");
        }
        
        
    }
}
