package java_code;

import java.util.Scanner;

public class Leap_year
{
    public static void main(String[] args) {

        //Leap year-->divisble by 4
        //divisble by 400 but not divisble by 100

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=scanner.nextInt();
        if((year%4==0)||(year%400==0)&&(year%100!=0)){
            System.out.println(year+"given number is leap");
        }
        else{
            System.out.println(year+"given number is not leap");
        }

    }
}
