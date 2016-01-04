package com.mindfulprog.NTree;

/**
 * Created by nscross on 11/8/2015.
 */
public class NTreeNode<T extends Comparable> {
    public T data;
    public NTreeNode<T> adjacents;
}
