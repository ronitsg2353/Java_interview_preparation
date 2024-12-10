package java_code;

public class missing_No_Array {
    public static void main(String[] args) {

        int sum=0;

        int arr[]={1,2,3,4,6,7,8};
        int size=arr.length;
        int range=size+1;
        int expected_sum=range*(range+1)/2;

       for(int i=0;i<size;i++){
           sum=sum+arr[i];
       }
        System.out.println(expected_sum-sum);
    }
}
