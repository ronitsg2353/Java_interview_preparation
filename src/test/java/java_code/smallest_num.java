package java_code;

public class smallest_num {
    public static void main(String[] args) {



        int a[]={12,34,56,32,11};
        int smallest=a[0];

        for(int i=0;i<a.length;i++){
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
        System.out.println(smallest);
    }
    }
