package com.mindfulprog.NTree;

/**
 * Created by nscross on 11/8/2015.
 */
public class NBinaryTreeNode<T extends Comparable>  implements Comparable<NBinaryTreeNode>{
    public T data;
    public NBinaryTreeNode<T> left;
    public NBinaryTreeNode<T> right;

    public NBinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }

    @Override public int compareTo(NBinaryTreeNode o) {
        return data.compareTo(o.data);
    }
}
