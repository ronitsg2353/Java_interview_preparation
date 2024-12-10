package java_code;

public class max_min_no_in_array {
    public static void main(String[] args) {
        int arr[]={45,32,5,221,56,78};

        int max=arr[0];
        int min=arr[0];
        int size=arr.length;

        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
