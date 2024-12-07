package java_code;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
int n, sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();

        while(num>0){
         n= num%10;
          sum= sum+n;
          num=num/10;

        }
        System.out.println(sum);


    }
}
