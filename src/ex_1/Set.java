package ex_1;

import java.util.TreeSet;

public class Set<T> {

    private TreeSet<T> set = new TreeSet<T>();

    public Set(TreeSet<T> set) {
        this.set = set;
    }

    public void add(TreeSet<T> set, T object) {
        set.add(object);
    }

}