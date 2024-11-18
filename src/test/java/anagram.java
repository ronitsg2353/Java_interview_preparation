import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {


        String str1="listen";
        String str2="silent";

        char [] char1=str1.toCharArray();
        char [] char2=str2.toCharArray();


        Boolean result=Arrays.equals(char1,char2);
        if(result==true)


            System.out.println("anagram");
        else
            System.out.println("no anagram");


    }
}
