// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int a = 4;
        int b = 14;
        
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i==1 || i==a || j==1 || j==b){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}

* * * * * * * * * * * * * * 
*                         * 
*                         * 
* * * * * * * * * * * * * * 
