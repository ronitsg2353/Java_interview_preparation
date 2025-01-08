package java_code;

import java.util.Arrays;

public class ascending_order {
    public static void main(String[] args) {
        int temp;
        int[] arr = {34, 56, 32, 23, 121, 78};

        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
    }

//---------------------------------------------------------------------------
//by using sorting

    public static void sort_ascending_order() {
int [] num={12,45,23,56,43};

Arrays.sort(num);
for(int numbers:num){
    System.out.println(numbers);
}
    }
}

