package java_code;

import java.util.Scanner;

public class Armstrong_Np {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int num= scanner.nextInt();
       int orgnum=num;
       int cubeno=0;
       while(num>0){
           int rem=num%10;
           cubeno=cubeno+(rem*rem*rem);
           num=num/10;
       }
       if(orgnum==cubeno){
           System.out.println("armstrong no");
       }
       else{
           System.out.println("no armstrong numb");
       }
    }
}
