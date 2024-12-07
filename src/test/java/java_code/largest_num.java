package java_code;

public class largest_num {

    public static void main(String[] args) {

        int arr[]={34,22,67,43,78};
        int size=arr.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" is the largest number");
            break;
        }
    }
}
