package java_code;

public class left_rotatation_array {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int size=arr.length;
            int j;
            int n=3;
        for(int i=0;i<n;i++){
            int first=arr[0];
            for(j=0;j<size-1;j++) {
                arr[j] = arr[j + 1];
            }
            arr[j]=first;

            }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
