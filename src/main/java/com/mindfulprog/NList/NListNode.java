package com.mindfulprog.NList;

/**
 * Created by nscross on 12/4/2015.
 */
public class NListNode<T extends Comparable> {
    public T data;
    public NListNode next;
    public NListNode last;

    NListNode() {
        init();
    }

    NListNode(T data) {
        this.data = data;
        init();
    }

    private void init() {
        next = null;
        last = null;
    }

    public int compareTo(T o) {
        return data.compareTo(o);
    }
}
