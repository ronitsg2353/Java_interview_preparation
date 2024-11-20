package java_code;

public class Duplicate_array {
    public static void main(String[] args) {


        int arr[]={12,34,56,78,34};
        int size=arr.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){

                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
