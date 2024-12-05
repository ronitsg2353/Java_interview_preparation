package java_code;

public class reverse_string {

    public static void main(String[] args) {


        String str="ronit";

        char [] ch=str.toCharArray();

        int size=ch.length;
        for(int i=size-1;i>=0;i--){
            System.out.println(str.charAt(i));

    }
}}
