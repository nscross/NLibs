package com.mindfulprog.NStack;

/**
 * Created by nscross on 11/2/2015.
 */
public class NArrayStack {
    private Object[] stack;
    private static final int MinimumSize = 10;
    private int size;

    private int length;

    public NArrayStack() {
        init(MinimumSize);
    }

    public NArrayStack(int initialSize) {
        init(initialSize);
    }

    private void init(int initialSize) {
        stack = new Object[initialSize];
        size = initialSize;
        length = 0;
    }

    public void push(Object objToAdd) {
        if (capacity() == 0) {
            resize();
        }

        stack[length] = objToAdd;
        length++;
    }

    public int capacity() {
        return size - length;
    }

    public int length() {
        return length;
    }

    private void resize() {
        int newSize = size * 2;
        Object[] newStack = new Object[newSize];

        for (int ndx = 0; ndx < size; ndx++) {
            newStack[ndx] = stack[ndx];
        }
        stack = newStack;
        size = newSize;
    }

    public Object pop() {
        Object objToReturn = null;
        if (length > 0) {
            objToReturn = stack[length-1];
            stack[length-1] = null;
            length--;
        }
        return objToReturn;
    }
}
