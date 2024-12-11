package java_code;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class remove_duplicate_Set {
    public static void main(String[] args) {

        int arr[] = {23, 45, 23, 56, 78};
        int size = arr.length;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(arr[i]);

        }
        System.out.println(set);

        //Sorted Array using set

        Set<Integer> set1 = new TreeSet<>();
        set1.add(arr[i]);
    }
    System.out.println(set1);

}
}
