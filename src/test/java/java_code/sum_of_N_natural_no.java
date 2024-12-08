package java_code;

import java.util.Scanner;

public class sum_of_N_natural_no {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
       int num= scanner.nextInt();
       int sum=0;

        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
