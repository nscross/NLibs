package com.mindfulprog.NTree;


import java.util.ArrayList;

/**
 * Created by nscross on 11/8/2015.
 */
public class NBinarySearchTree<T extends Comparable> {
    public NBinaryTreeNode<T> root;

    public NBinarySearchTree() {
        root = null;
    }



    public void add(T objToAdd) {
        if (root == null) {
            root = new NBinaryTreeNode<>(objToAdd);


        }
        else {

        }

    }


    /*
    public addRec(T objectToAdd, NBinaryTreeNode root) {
        if (root == null) {
            return;
        }
        else {

    }
    */

    public ArrayList<T> dpsInOrder() {
        ArrayList<T> rvalue = new ArrayList<>();

        return rvalue;
    }

    public ArrayList<T> dpsPreOrder() {
        ArrayList<T> rvalue = new ArrayList<>();

        return rvalue;
    }

    public ArrayList<T> dpsPostOrder() {
        ArrayList<T> rvalue = new ArrayList<>();

        return rvalue;
    }

}
