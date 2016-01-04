package com.mindfulprog.NStack;

/**
 * Created by nscross on 11/2/2015.
 */
public class NStackNode<T extends Comparable> implements Comparable<NStackNode>{
    public T data;
    public NStackNode<T> next;
    public NStackNode<T> min;

    public NStackNode(T dataToSet) {
        data = dataToSet;
        next = null;
        min = null;
    }

    @Override public int compareTo(NStackNode o) {
        if (o == null) {
            throw new NullPointerException();
        }
        return this.data.compareTo(o.data);
    }
}
