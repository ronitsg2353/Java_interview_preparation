public class reverse_string {

    public static void main(String[] args) {


        String str="ronit";
        int i;
        char [] ch=str.toCharArray();
        String rev = "";

        int size=ch.length;
        for( i=size-1;i>=0;i--){
            System.out.println(str.charAt(i));

        }
        System.out.println(rev);

    }
}
