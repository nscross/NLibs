package com.mindfulprog.NStack;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Created by nscross on 11/3/2015.
 */
public class SetOfStacksTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SetOfStacksTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SetOfStacksTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDefaultConstructor()
    {
        SetOfStacks<String> sos = new SetOfStacks<>(5);

        assertEquals(0,sos.length());
    }

    public void testPush() {
        SetOfStacks<String> sos = new SetOfStacks<>(5);

        sos.push("Sup");

        assertEquals(1,sos.length());
    }

    public void testPop() {
        SetOfStacks<String> sos = new SetOfStacks<>(5);

        sos.push("Sup");

        assertEquals(1,sos.length());
        assertEquals("Sup", sos.pop());
        assertEquals(0,sos.length());
    }

    public void testMultiplePop() {
        SetOfStacks<String> sos = new SetOfStacks<>(5);

        sos.push("foo");
        sos.push("bar");
        sos.push("foobar");

        assertEquals(3,sos.length());

        assertEquals("foobar", sos.pop());
        assertEquals("bar", sos.pop());
        assertEquals("foo", sos.pop());
        assertEquals(0,sos.length());
    }

    public void testResize() {
        SetOfStacks<String> sos = new SetOfStacks<>(5);

        sos.push("foo");
        sos.push("bar");
        sos.push("foobar");
        sos.push("one");
        sos.push("two");

        assertEquals(5,sos.length());
        sos.push("three");
        sos.push("four");
        assertEquals(7,sos.length());

        assertEquals("four", sos.pop());
        assertEquals("three", sos.pop());
        assertEquals("two", sos.pop());
        assertEquals("one", sos.pop());
        assertEquals("foobar", sos.pop());
        assertEquals("bar", sos.pop());
        assertEquals("foo", sos.pop());

        assertEquals(0,sos.length());
    }

    public void testMultipleStacks() {
        SetOfStacks<String> sos = new SetOfStacks<>(2);

        sos.push("foo");
        sos.push("bar");
        sos.push("foobar");
        sos.push("one");
        sos.push("two");

        assertEquals(5,sos.length());
        sos.push("three");
        sos.push("four");
        assertEquals(7,sos.length());

        assertEquals("four", sos.pop());
        assertEquals("three", sos.pop());
        assertEquals("two", sos.pop());
        assertEquals("one", sos.pop());
        assertEquals("foobar", sos.pop());
        assertEquals("bar", sos.pop());
        assertEquals("foo", sos.pop());

        assertEquals(0,sos.length());
    }

    public void testMiddlePop() {
        SetOfStacks<String> sos = new SetOfStacks<>(2);

        sos.push("foo");
        sos.push("bar");
        sos.push("foobar");
        sos.push("one");
        sos.push("two");

        assertEquals(5,sos.length());
        sos.push("three");
        sos.push("four");
        assertEquals(7,sos.length());

        assertEquals("one", sos.pop(2));

        assertEquals("four", sos.pop());
        assertEquals("three", sos.pop());
        assertEquals("two", sos.pop());
        assertEquals("foobar", sos.pop());
        assertEquals("bar", sos.pop());
        assertEquals("foo", sos.pop());

        assertEquals(0,sos.length());
    }
}
