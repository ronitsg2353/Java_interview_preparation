package java_code;

import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int rev=0;
        int rem=0;
        int orgnum=num;
        while(num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println(rev);
        if(orgnum==rev){
            System.out.println("plaindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}

