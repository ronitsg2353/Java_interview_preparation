package java_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicate_Array_HashSet {
    public static void main(String[] args) {
        int arr[]={4,3,4,5,55,5,2,2,1};
        int size=arr.length;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<size;i++){
            set.add(arr[i]);
        }
        Integer[] b=set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(b));
    }
}
