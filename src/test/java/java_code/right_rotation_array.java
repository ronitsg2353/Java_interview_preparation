package java_code;

public class right_rotation_array {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int size=arr.length;
        int n=3;

        for(int i=0;i<n;i++){
            int last=arr[size-1];
            for(int j=size-1;j>0;j--){
                arr[j]=arr[j-1];

            }
            arr[0]=last;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
