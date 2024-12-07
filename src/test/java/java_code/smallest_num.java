package java_code;

import java.security.spec.RSAOtherPrimeInfo;

public class smallest_num {
    public static void main(String[] args) {
        int arr[]={34,23,11,67,64};
        int size=arr.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
            break;
        }
    }
    }
