// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int num = 1;
        int num2 = 0;
        int counter =2;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if(counter%2==0){
                System.out.print(num+" ");
                counter++;
                }else{
                System.out.print(num2+" ");
                counter++;
                }
            }
            System.out.print("\n");
        }
    }
}
1 
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1 
