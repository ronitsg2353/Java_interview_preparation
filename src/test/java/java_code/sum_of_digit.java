package java_code;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
       int num= scanner.nextInt();
       int sum=0;

       while (num>0){
           int rem=num%10;
           sum=sum+rem;
           num=num/10;
       }
        System.out.println(sum);

    }
}
