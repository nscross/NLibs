package com.mindfulprog.NStack;

import java.util.ArrayList;

/**
 * Created by nscross on 11/3/2015.
 */
public class SetOfStacks<T extends Comparable> {
    private final int StackThreshold;
    private ArrayList<NStack<T>> stacks;

    public SetOfStacks(int stackThreshold) {
        StackThreshold = stackThreshold;
        stacks = new ArrayList<>();
    }

    public void push(T obj) {
        if (stacks.size() > 0) {
            if (stacks.get(0).length() == StackThreshold) {
                stacks.add(0, new NStack<>());
            }
        }
        else {
            stacks.add(0, new NStack<>());
        }

        stacks.get(0).push(obj);
    }

    public T pop(int stackNumber) {
        return popInternal(stackNumber);
    }

    public T pop() {
        return popInternal(0);
    }

    private T popInternal(int stackNumber) {
        T objToReturn = null;
        if (stacks.size() > stackNumber) {
            objToReturn = stacks.get(stackNumber).pop();
            if (stacks.get(stackNumber).length() == 0) {
                stacks.remove(stackNumber);
            }
        }
        return objToReturn;
    }

    public int length() {
        int length = 0;

        for (NStack stack : stacks) {
            length += stack.length();
        }
        return length;
    }
}
