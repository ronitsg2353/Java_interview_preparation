import java.util.Scanner;

public class fibonnaci_number {
    public static void main(String[] args) {
        
        
        int i,a=0,b=1;
        int c = 0;
        System.out.println("Enter the nummber:");

        Scanner scanner=new Scanner(System.in);
       int num= scanner.nextInt();
       
       for( i=1;i<num;i++){
           c=a+b;
           a=b;
           b=c;

           System.out.println(c);

       }

    }
}
