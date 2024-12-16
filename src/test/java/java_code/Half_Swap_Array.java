package java_code;

public class Half_Swap_Array
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int size=arr.length;
        int temp=0;
        for(int i=0;i<size/2;i++){
            temp=arr[i];
            arr[i]=arr[size/2+i];
            arr[size/2+i]=temp;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
