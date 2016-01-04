package com.mindfulprog.NStack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by nscross on 11/2/2015.
 */
public class NStackTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NStackTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NStackTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDefaultConstructor()
    {
        NStack nas = new NStack();

        assertEquals(0,nas.length());
    }

    public void testPush() {
        NStack nas = new NStack();

        nas.push("Sup");

        assertEquals(1,nas.length());
    }

    public void testPop() {
        NStack nas = new NStack();

        nas.push("Sup");

        assertEquals(1,nas.length());
        assertEquals("Sup", nas.pop());
        assertEquals(0,nas.length());
    }

    public void testMultiplePop() {
        NStack<String> nas = new NStack<>();

        nas.push("foo");
        nas.push("bar");
        nas.push("foobar");

        assertEquals(3,nas.length());

        assertEquals("foobar", nas.pop());
        assertEquals("bar", nas.pop());
        assertEquals("foo", nas.pop());
        assertEquals(0,nas.length());
    }

    public void testResize() {
        NStack<String> nas = new NStack<>();

        nas.push("foo");
        nas.push("bar");
        nas.push("foobar");
        nas.push("one");
        nas.push("two");

        assertEquals(5,nas.length());
        nas.push("three");
        nas.push("four");
        assertEquals(7,nas.length());

        assertEquals("four", nas.pop());
        assertEquals("three", nas.pop());
        assertEquals("two", nas.pop());
        assertEquals("one", nas.pop());
        assertEquals("foobar", nas.pop());
        assertEquals("bar", nas.pop());
        assertEquals("foo", nas.pop());

        assertEquals(0,nas.length());
    }

    public void testMin() {
        NStack nas = new NStack();

        nas.push("a");
        assertEquals("a", nas.min());
        nas.push("ba");
        assertEquals("a", nas.min());

    }

    public void testMin2() {
        NStack<String> nas = new NStack<>();

        nas.push("da");
        assertEquals("da", nas.min());
        nas.push("c");
        assertEquals("c", nas.min());
        nas.push("z");
        assertEquals("c", nas.min());
        nas.pop();
        assertEquals("c", nas.min());
        nas.pop();
        assertEquals("da", nas.min());
        nas.pop();
        assertEquals(null, nas.min());

    }
}
