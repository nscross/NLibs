package com.mindfulprog.NTree;

/**
 * Created by nscross on 1/4/2016.
 */
public class NBalancedBST<T extends Comparable> extends NBinarySearchTree<T> {
    NBalancedBST() {
        super();
    }

    public void add(T objToAdd) {
        super.add(objToAdd);
        balance();
    }

    private void balance() {
        if (root != null) {
            int leftHeight = getHeight(root.left, 0);
            int rightHeight = getHeight(root.right, 0);

            if (leftHeight - rightHeight > 1 ) {
                NBinaryTreeNode<T> tmp = root;
                root = root.left;
                root.right = tmp;
                root.right.left = null;
            }
            else if (rightHeight - leftHeight > 1 ){
                NBinaryTreeNode<T> tmp = root;
                root = root.right;
                root.left = tmp;
                root.left.right = null;
            }
        }
    }



    private int getHeight(NBinaryTreeNode<T> node, int currentHeight) {
        if (node != null) {
            return (Math.max(getHeight(node.left, currentHeight + 1), getHeight(node.right, currentHeight + 1)));
        }
        else {
            return currentHeight;
        }
    }
}
