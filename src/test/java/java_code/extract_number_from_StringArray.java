package java_code;

public class extract_number_from_StringArray {

    public static void main(String[] args) {
        String[] strarr = {"pink123", "green345", "nature5676"};

        for(String str:strarr){
            String str1=str.replaceAll("[^0-9]","");
            System.out.println(str1);
        }

    }
}
