package com.mindfulprog.NStringBuffer;



/**
 * Created by nscross on 10/20/2015.
 * Inspired by http://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html
 */
public class NStringBuffer {
    private char[] internalString;
    private int stringLen;
    private int size;

    public int length() {
        return this.stringLen;
    }

    public int capacity() {
        return size - stringLen;

    }

    public NStringBuffer() {
        this.size = 16;
        internalString = new char[this.size];
        stringLen = 0;
    }

    private boolean hasEnoughRoom(int dataToAddLen) {
        return (dataToAddLen + stringLen) <= this.size;
    }

    private void increaseSize() {
        this.size = this.size *2;
        char[] newString = new char[this.size];

        for (int ndx = 0; ndx < this.stringLen; ndx++){
            newString[ndx] = this.internalString[ndx];
        }

        this.internalString = newString;
    }
    public void append(String newString) {
        char dataToAdd[] = newString.toCharArray();
        int dataToAddLen = newString.length();
        if (!hasEnoughRoom(dataToAddLen)) {
            increaseSize();
        }

        for (int ndx = this.stringLen; ndx < this.stringLen + dataToAddLen; ndx++){
            this.internalString[ndx] = dataToAdd[ndx - this.stringLen];
        }
        this.stringLen += dataToAddLen;
    }

    public String toString() {
        return new String(this.internalString).trim();
    }
}
