public class desceding_order {
    public static void main(String[] args) {

        int temp;
        int []arr={34,56,32,23,121,78};

        int size=arr.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);

        }
    }
}
