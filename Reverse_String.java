// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String str = "chirag choudhary";
        
        StringBuilder sb = new StringBuilder("");
        int right = str.length()-1;
        while(right>=0){
            sb.append(str.charAt(right));
            right--;
        }
        
        System.out.println(sb.toString());
    }
}

// yrahduohc garihc
