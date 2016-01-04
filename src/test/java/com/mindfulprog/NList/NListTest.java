package com.mindfulprog.NList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

/**
 * Created by nscross on 11/2/2015.
 */
public class NListTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NListTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(NListTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd() {
        NList<String> nl = new NList<>();

        nl.add("Happy");

        assertEquals("Happy", nl.getAt(0));

        nl.add("Birthday");

        assertEquals("Birthday", nl.getAt(1));
    }

    public void testGetAt() {
        NList<String> nl = new NList<>();

        assertEquals(null, nl.getAt(0));
        assertEquals(null, nl.getAt(1));

        nl.add("Happy");

        assertEquals("Happy", nl.getAt(0));

        nl.add("Birthday");
        assertEquals("Birthday", nl.getAt(1));
    }

    public void testRemoveAtNulls() {
        NList<String> nl = new NList<>();

        assertEquals(null, nl.removeAt(0));
        assertEquals(null, nl.removeAt(1));


        nl.add("Happy");
        assertEquals(null, nl.removeAt(1));

        nl.add("Birthday");
        assertEquals(null, nl.removeAt(2));
    }

    public void testRemoveAtSuccess() {
        NList<String> nl = new NList<>();

        nl.add("Happy");
        assertEquals(null, nl.removeAt(1));

        nl.add("Birthday");
        assertEquals("Happy", nl.removeAt(0));
        assertEquals("Birthday", nl.removeAt(0));
        assertEquals(null, nl.removeAt(0));
    }

    public void testToList() {
        NList<String> nl = new NList<>();
        ArrayList<String> input = new ArrayList<>();

        input.add("Test");
        input.add("message");
        input.add("Please");
        input.add("Ignore");

        for (String s : input) {
            nl.add(s);
        }

        ArrayList<String> output = nl.toArrayList();
        for(int ndx = 0; ndx < input.size(); ndx++) {
            assertEquals(input.get(ndx), output.get(ndx));
        }

    }
}
