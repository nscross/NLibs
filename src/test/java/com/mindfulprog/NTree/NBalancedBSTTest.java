package com.mindfulprog.NTree;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nscross on 1/4/2016.
 */
public class NBalancedBSTTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NBalancedBSTTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NBalancedBSTTest.class );
    }

    /**
     * Rigourous Test :-)
     */

    //region Balance testing
    public void testDPSInOrder1()
    {
        NBalancedBST<Integer> bst = new NBalancedBST();

        bst.add(5);
        bst.add(3);
        bst.add(8);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(5);
        expectedResults.add(3);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsInOrder());
    }

    public void testDPSInOrder2()
    {
        NBalancedBST<Integer> bst = new NBalancedBST();

        bst.add(3);
        bst.add(5);
        bst.add(8);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(5);
        expectedResults.add(3);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsInOrder());
    }

    public void testDPSInOrder3()
    {
        NBalancedBST<Integer> bst = new NBalancedBST();

        bst.add(5);
        bst.add(8);
        bst.add(3);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(5);
        expectedResults.add(3);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsInOrder());
    }


    public void testDPSInOrder4()
    {
        NBalancedBST<Integer> bst = new NBalancedBST();

        bst.add(31);
        bst.add(32);
        bst.add(44);
        bst.add(63);
        bst.add(92);
        bst.add(71);
        bst.add(7);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(44);
        expectedResults.add(32);
        expectedResults.add(31);
        expectedResults.add(7);
        expectedResults.add(63);
        expectedResults.add(92);
        expectedResults.add(71);

        assertEquals(expectedResults,bst.dpsInOrder());
    }

    /*
    public void testDPSInOrder4()
    {
        NBalancedBST<Integer> bst = new NBalancedBST();

        bst.add(31);
        bst.add(32);
        bst.add(44);
        bst.add(63);
        bst.add(92);
        bst.add(71);
        bst.add(7);
        bst.add(93);
        bst.add(84);
        bst.add(49);
        bst.add(78);
        bst.add(92);
        bst.add(21);
        bst.add(22);
        bst.add(10);
        bst.add(96);
        bst.add(53);
        bst.add(32);
        bst.add(16);
        bst.add(87);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(31);
        expectedResults.add(7);
        expectedResults.add(21);
        expectedResults.add(10);
        expectedResults.add(16);
        expectedResults.add(22);
        expectedResults.add(32);
        expectedResults.add(32);
        expectedResults.add(44);
        expectedResults.add(63);
        expectedResults.add(49);
        expectedResults.add(53);
        expectedResults.add(92);
        expectedResults.add(71);
        expectedResults.add(84);
        expectedResults.add(78);
        expectedResults.add(92);
        expectedResults.add(87);
        expectedResults.add(93);
        expectedResults.add(96);

        assertEquals(expectedResults,bst.dpsInOrder());
    }
    */

    public void testDPSInOrder5()
    {
        NBalancedBST<Integer> bst = new NBalancedBST();

        bst.add(8);
        bst.add(5);
        bst.add(3);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(5);
        expectedResults.add(3);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsInOrder());
    }
    //endregion
}

