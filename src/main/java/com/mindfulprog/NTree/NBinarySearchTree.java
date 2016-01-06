package com.mindfulprog.NTree;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nscross on 11/8/2015.
 */
public class NBinarySearchTree<T extends Comparable> {
    public NBinaryTreeNode<T> root;
    private List<T> printValues;

    public NBinarySearchTree() {
        root = null;
    }



    public void add(T objToAdd) {
        if (root == null) {
            root = new NBinaryTreeNode<>(objToAdd);
        }
        else {
            addRec(objToAdd, root);
        }
    }

    private void addRec(T objectToAdd, NBinaryTreeNode<T> node) {
        if (node != null) {
            if (objectToAdd.compareTo(node.data) <= 0) {
                if (node.left != null) {
                    addRec(objectToAdd, node.left);
                }
                else {
                    node.left = new NBinaryTreeNode<>(objectToAdd);
                }
            }
            else {
                if (node.right != null) {
                    addRec(objectToAdd, node.right);
                }
                else {
                    node.right = new NBinaryTreeNode<>(objectToAdd);
                }
            }
        }
    }


    //region To List Functions
    public List<T> dpsInOrder() {
        printValues = new ArrayList<>();
        dpsInOrderRec(root);
        return printValues;
    }

    private void dpsInOrderRec(NBinaryTreeNode<T> node) {
        if (node != null) {
            printValues.add(node.data);
            if (node.left != null) {
                dpsInOrderRec(node.left);
            }

            if (node.right != null) {
                dpsInOrderRec(node.right);
            }
        }
    }

    public List<T> dpsPreOrder() {
        printValues = new ArrayList<>();
        dpsPreOrderRec(root);
        return printValues;
    }

    private void dpsPreOrderRec(NBinaryTreeNode<T> node) {
        if (node != null) {

            if (node.left != null) {
                dpsPreOrderRec(node.left);
            }

            printValues.add(node.data);

            if (node.right != null) {
                dpsPreOrderRec(node.right);
            }
        }
    }

    public List<T> dpsPostOrder() {
        printValues = new ArrayList<>();
        dpsPostOrderRec(root);
        return printValues;
    }

    private void dpsPostOrderRec(NBinaryTreeNode<T> node) {
        if (node != null) {

            if (node.left != null) {
                dpsPostOrderRec(node.left);
            }

            if (node.right != null) {
                dpsPostOrderRec(node.right);
            }

            printValues.add(node.data);
        }
    }
    //endregion

}
