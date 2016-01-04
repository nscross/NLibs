package com.mindfulprog.NStack;

import java.util.Comparator;

/**
 * Created by nscross on 11/2/2015.
 */
public class NStack<T extends Comparable> {
    private NStackNode<T> top;
    private int length;


    public NStack() {
        top = null;
        length = 0;

    }

    public void push(T objToAdd) {
        if (top == null) {
            top = new NStackNode<>((objToAdd));
            top.next = null;
            top.min = top;
        }
        else {
            NStackNode<T> newNode = new NStackNode<>((objToAdd));
            newNode.next = top;
            top = newNode;
            if (top.compareTo(top.next.min) >= 0) {
                top.min = top.next.min;
            }
            else
            {
                top.min = top;
            }
        }
        length++;
    }

    public T pop() {
        NStackNode<T> objToReturn = top;
        if (top != null) {
            top = top.next;
            length--;
            return objToReturn.data;
        }
        else  {
            return null;
        }

    }

    public int length() {
        return length;
    }

    public T min() {
        T objToReturn = null;

        if (top != null)
        {
            objToReturn =  top.min.data;
        }
        return objToReturn;
    }
}
