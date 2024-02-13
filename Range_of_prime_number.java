// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    static boolean isPrime(int a){
        for(int i=2; i*i<=a; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int a = 2;
        int b = 27;
        
        for(int i=a; i<=b; i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
}
2 3 5 7 11 13 17 19 23 
