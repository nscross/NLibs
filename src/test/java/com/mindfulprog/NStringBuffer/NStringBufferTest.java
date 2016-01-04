package com.mindfulprog.NStringBuffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class NStringBufferTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NStringBufferTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NStringBufferTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testConstructor()
    {
        NStringBuffer nsb = new NStringBuffer();

        assertEquals("",nsb.toString());
    }

    public void testAppend()
    {
        NStringBuffer nsb = new NStringBuffer();
        nsb.append("Hello");
        assertEquals("Hello", nsb.toString());
    }

    public void testAppendComma()
    {
        NStringBuffer nsb = new NStringBuffer();
        nsb.append("Hello");
        assertEquals("Hello",nsb.toString());
        nsb.append(",");
        assertEquals("Hello,",nsb.toString());
    }

    public void testLength() {
        NStringBuffer nsb = new NStringBuffer();
        assertEquals(0, nsb.length());
        nsb.append("Hello");
        assertEquals(5, nsb.length());
        nsb.append(",");
        assertEquals(6, nsb.length());
    }

    public void testCapacity() {
        NStringBuffer nsb = new NStringBuffer();
        nsb.append("Hello");
        nsb.append(",");
        assertEquals(10, nsb.capacity());
    }

    public void testResize()
    {
        NStringBuffer nsb = new NStringBuffer();
        nsb.append("Hello,World!1234");
        assertEquals(16,nsb.length());
        assertEquals(0, nsb.capacity());
        nsb.append("farout");
        assertEquals(22,nsb.length());
        assertEquals(10, nsb.capacity());
    }


    public void testVsString()
    {

        long stringStartTime = System.nanoTime();
        String stringToBuild = "";
        for (int ndx = 0; ndx < 2000; ndx++) {
            stringToBuild = stringToBuild + new Integer(ndx).toString();
        }
        System.out.println(stringToBuild);
        long stringEndTime = System.nanoTime();

        long nsbStartTime = System.nanoTime();
        NStringBuffer nsbToBuild = new NStringBuffer();
        for (int ndx = 0; ndx < 2000; ndx++) {
            nsbToBuild.append(new Integer(ndx).toString());
        }
        System.out.println(nsbToBuild.toString());

        long nsbEndTime = System.nanoTime();

        long stringDuration = (stringEndTime - stringStartTime);
        long nsbDuration = (nsbEndTime - nsbStartTime);

        assertEquals(true, stringDuration > nsbDuration);

        //System.out.println("String: " + (stringEndTime - stringStartTime) + ", NSB: " + (nsbEndTime - nsbStartTime));
        //System.out.println("Speed increase of: " + ((stringDuration - nsbDuration) / (double)stringDuration) * 100);

    }
}
