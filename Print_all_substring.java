// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String str = "abc";
        
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}

// a
// ab
// abc
// b
// bc
// c
