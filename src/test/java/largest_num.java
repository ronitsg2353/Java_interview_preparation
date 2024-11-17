public class largest_num {

    public static void main(String[] args) {

        int a[]={12,34,56,32,11};
        int largest=a[0];

        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
            }
        }
        System.out.println(largest);
    }
}
