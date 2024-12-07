package java_code;

public class missing_No_Array {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,6,7,8};
        int range=8;
        int expected_sum=range*(range+1)/2;
        int actual_sum=0;
        for(int num:arr){
            actual_sum+=num;
        }
        System.out.println(expected_sum-actual_sum);
    }
}
