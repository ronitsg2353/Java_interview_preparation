import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Enter the number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime no");
        }
        else{
            System.out.println("no prime number");
        }
    }
}
