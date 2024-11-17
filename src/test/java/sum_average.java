public class sum_average {
    public static void main(String[] args) {

        int sum=0;
        int average=0;

        int a[]={34,56,23,78,65};
        int length=a.length;

        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            average=sum/length;
        }
        System.out.println(sum);
        System.out.println(average);


    }
}
