package java_code;

public class extract_number_from_StringArray {

    public static void main(String[] args) {
        String [] strarr={"pink123","green345","nature5676"};
        int size=strarr.length;

        for(String str:strarr){
           String numbers= str.replaceAll("[^0-9]","");
            if(!numbers.isEmpty()){
                System.out.println(Integer.parseInt(numbers));
            }
        }
    }
}
