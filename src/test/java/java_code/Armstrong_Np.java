package java_code;

public class Armstrong_Np {

    public static void main(String[] args) {
        int  num=134;
        int orgnum=num;
        int sum=0;

        while(num>0){
            int digit=num%10;

            sum+=(digit*digit*digit);

            num/=10;
        }

        if(sum==orgnum){
            System.out.println(orgnum+ "armstrong number");
        }
        else{
            System.out.println(orgnum+" no armstrong");
        }
    }
}
