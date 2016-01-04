package com.mindfulprog.NList;

import java.util.ArrayList;

/**
 * Created by nscross on 12/4/2015.
 */
public class NList<T extends Comparable> {
    NListNode<T> head;
    private int count;

    NList() {
        head = null;
        count = 0;
    }

    public void add(T itemToAdd) {
        if (head == null) {
            head = new NListNode<>(itemToAdd);
        }
        else {
            NListNode<T> itr = head;
            while(itr.next != null) {
                itr = itr.next;
            }
            itr.next = new NListNode<>(itemToAdd);
            itr.next.last = itr;
        }
        count++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (head != null) {
            sb.append(head.data.toString());

            NListNode<T> itr = head;
            while(itr.next != null) {
                itr = itr.next;
                sb.append(itr.data.toString());
            }
        }
        return sb.toString();
    }

    public ArrayList<T> toArrayList() {
        ArrayList<T> listOfItems = new ArrayList<>();

        if (head != null) {
            listOfItems.add(head.data);

            NListNode<T> itr = head;
            while(itr.next != null) {
                itr = itr.next;
                listOfItems.add(itr.data);
            }
        }
        return listOfItems;
    }


    public T removeAt(int ndx) {
        T itemToReturn = null;

        if (head != null) {
            NListNode<T> itr = head;
            int itr_ndx = 0;

            if (ndx == 0) {
                itemToReturn = head.data;
                head = head.next;
                count--;

                if (head != null) {
                    head.last = null;
                }
            }
            else {
                while (itr.next != null) {

                    if (itr_ndx + 1 == ndx) {
                        itemToReturn = (T)itr.next.data;
                        NListNode<T> tmp = itr.next;

                        itr.next = itr.next.next;

                        if (itr.next != null) {
                            itr.next.last = itr;
                        }
                        count--;
                        break;
                    }
                    itr = itr.next;
                    itr_ndx++;
                }
            }
        }

        return itemToReturn;
    }

    public T getAt(int ndx) {
        T itemToReturn = null;

        if (head != null) {
            NListNode<T> itr = head;

            int itr_ndx = 0;

            if (ndx == 0) {
                itemToReturn = head.data;
            }
            else {
                while (itr.next != null) {
                    itr_ndx++;
                    itr = itr.next;

                    if (itr_ndx == ndx) {
                        itemToReturn = itr.data;
                        break;
                    }
                }
            }
        }

        return itemToReturn;
    }
}
