package java_code;

public class reverse_number {

    public static void main(String[] args) {
        
        int num=2353;
        int rev = 0;

        while(num!=0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(rev);
    }
}
