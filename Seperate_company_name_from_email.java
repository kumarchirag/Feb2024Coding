// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String email1 = "chirag.choudhary123@gmail.com";
        String email2 = "aman.ranjan123@hotmail.com";
        
        String[] company1 = email1.split("@");
        String[] company2 = email2.split("@");
        
        String newCompany1= company1[company1.length-1];
        String newCompany2= company2[company2.length-1];
        
        int ans1 = newCompany1.lastIndexOf(".");
        int ans2 = newCompany2.lastIndexOf(".");
        
        String finalAns1= newCompany1.substring(0,ans1);
        String finalAns2= newCompany2.substring(0,ans2);
        
        System.out.println(finalAns1);
        System.out.println(finalAns2);
    }
}

// gmail
// hotmail
