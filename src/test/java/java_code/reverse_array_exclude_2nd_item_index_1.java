package java_code;

public class reverse_array_exclude_2nd_item_index_1 {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5};
        int size = arr.length;

        for (int i = size - 1; i >= 0; i--) {
            if(i!=1)
            System.out.println(arr[i]);

        }
    }
}
