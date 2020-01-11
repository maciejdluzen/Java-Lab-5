package ex_1;

import java.util.TreeSet;

public class MainClass {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        Set<Integer> set1 = new Set<>(treeSet);

        set1.add(treeSet, 5);

        for (Integer val : treeSet) {
            System.out.println(val);
        }
    }
}
