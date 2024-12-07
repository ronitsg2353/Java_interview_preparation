package java_code;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Merge_two_List {
    public static void main(String[] args) {
        List<String>list1=new ArrayList<>();

        list1.add("Ronit");


        List<String>list2=new ArrayList<>();
        list2.add("Gaikwad");

        List<String>mergedlist=new ArrayList<>(list1);
        mergedlist.addAll(list2);
        System.out.println(mergedlist);
    }
}
