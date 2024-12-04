package java_code;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {


        String str1="listen";
        String str2="silent";

        char [] char1=str1.toCharArray();
        char [] char2=str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        Boolean result=Arrays.equals(char1,char2);
        if(result==true)


            System.out.println("java_code.anagram");
        else
            System.out.println("no java_code.anagram");


    }
}
