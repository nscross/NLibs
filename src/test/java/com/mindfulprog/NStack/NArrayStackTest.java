package com.mindfulprog.NStack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by nscross on 11/2/2015.
 */
public class NArrayStackTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NArrayStackTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NArrayStackTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDefaultConstructor()
    {
        NArrayStack nas = new NArrayStack();

        assertEquals(10,nas.capacity());
    }

    public void testCustomConstructor()
    {
        NArrayStack nas = new NArrayStack(5);

        assertEquals(5,nas.capacity());
    }

    public void testPush() {
        NArrayStack nas = new NArrayStack(5);

        nas.push("Sup");

        assertEquals(4,nas.capacity());
    }

    public void testPop() {
        NArrayStack nas = new NArrayStack(5);

        nas.push("Sup");

        assertEquals(4,nas.capacity());
        assertEquals("Sup", nas.pop());
        assertEquals(5,nas.capacity());
    }

    public void testMultiplePop() {
        NArrayStack nas = new NArrayStack(5);

        nas.push("foo");
        nas.push("bar");
        nas.push("foobar");

        assertEquals(2,nas.capacity());

        assertEquals("foobar", nas.pop());
        assertEquals("bar", nas.pop());
        assertEquals("foo", nas.pop());
        assertEquals(5,nas.capacity());
    }

    public void testResize() {
        NArrayStack nas = new NArrayStack(5);

        nas.push("foo");
        nas.push("bar");
        nas.push("foobar");
        nas.push("one");
        nas.push("two");

        assertEquals(0,nas.capacity());
        nas.push("three");
        nas.push("four");
        assertEquals(3,nas.capacity());

        assertEquals("four", nas.pop());
        assertEquals("three", nas.pop());
        assertEquals("two", nas.pop());
        assertEquals("one", nas.pop());
        assertEquals("foobar", nas.pop());
        assertEquals("bar", nas.pop());
        assertEquals("foo", nas.pop());

        assertEquals(10,nas.capacity());
    }
}
