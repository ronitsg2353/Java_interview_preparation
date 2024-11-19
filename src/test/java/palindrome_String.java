public class palindrome_String {
    public static void main(String[] args) {
        String rev = "";
        String str="radar";
        char [] ch=str.toCharArray();
        int size=ch.length;
        for(int i=size-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(str)){
            System.out.println("String is palidnrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }}
