package java_code;

public class spl_char_palindrome_String {
    public static void main(String[] args) {
        String str = "sou@rab$h";

        String str1 = str.replaceAll("[^0-9a-zA-Z]", "");
        System.out.println(str1);
        int size=str1.length();

        String rev="";
        for(int i=size-1;i>=0;i--){
            rev=rev+str1.charAt(i);
        }

        if(str1.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("non palindrome");
        }


    }
}
