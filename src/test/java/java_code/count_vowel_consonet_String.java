package java_code;

import java.util.Scanner;

public class count_vowel_consonet_String {
    public static void main(String[] args) {
        int vowel=0,consonent=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scanner.nextLine();
        String str1=str.toLowerCase();


        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='o'||ch=='i'||ch=='u'){
                vowel ++;
            }
            else{
                consonent++;
            }

        }
        System.out.println("No of vowels in string is"+vowel);
        System.out.println("No of consonent in string is"+consonent);
    }
}
