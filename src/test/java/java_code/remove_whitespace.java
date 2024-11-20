package java_code;

public class remove_whitespace {
    public static void main(String[] args) {

        String str="Ronit Gaikwad";

       String str1= str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
