package java_code;

public class Even_odd_number {
    public static void main(String[] args) {

        int arr[]={12,34,7,9};
        int size=arr.length;

        for(int i=0;i<=size-1;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+"given number is even");
            }
            else{
                System.out.println(arr[i]+"given numberi s odd");
            }
        }
    }
}
