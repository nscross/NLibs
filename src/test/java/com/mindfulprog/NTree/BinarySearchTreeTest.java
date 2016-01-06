package com.mindfulprog.NTree;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nscross on 11/15/2015.
 */
public class BinarySearchTreeTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BinarySearchTreeTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BinarySearchTreeTest.class );
    }

    /**
     * Rigourous Test :-)
     */

    //region DPS In Order Testing
    public void testDPSInOrder1()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

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
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(3);
        bst.add(5);
        bst.add(8);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(3);
        expectedResults.add(5);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsInOrder());
    }

    public void testDPSInOrder3()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

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
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

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

    public void testDPSInOrder5()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(8);
        bst.add(5);
        bst.add(3);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(8);
        expectedResults.add(5);
        expectedResults.add(3);

        assertEquals(expectedResults,bst.dpsInOrder());
    }
    //endregion

    //region DPS Pre Order Testing
    public void testDPSPreOrder1()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(5);
        bst.add(3);
        bst.add(8);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(3);
        expectedResults.add(5);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsPreOrder());
    }

    public void testDPSPreOrder2()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(3);
        bst.add(5);
        bst.add(8);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(3);
        expectedResults.add(5);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsPreOrder());
    }

    public void testDPSPreOrder3()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(5);
        bst.add(8);
        bst.add(3);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(3);
        expectedResults.add(5);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsPreOrder());
    }

    public void testDPSPreOrder4()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

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

        expectedResults.add(7);
        expectedResults.add(10);
        expectedResults.add(16);
        expectedResults.add(21);
        expectedResults.add(22);
        expectedResults.add(31);
        expectedResults.add(32);
        expectedResults.add(32);
        expectedResults.add(44);
        expectedResults.add(49);
        expectedResults.add(53);
        expectedResults.add(63);
        expectedResults.add(71);
        expectedResults.add(78);
        expectedResults.add(84);
        expectedResults.add(87);
        expectedResults.add(92);
        expectedResults.add(92);
        expectedResults.add(93);
        expectedResults.add(96);

        assertEquals(expectedResults,bst.dpsPreOrder());
    }

    public void testDPSPreOrder5()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(8);
        bst.add(5);
        bst.add(3);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(3);
        expectedResults.add(5);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsPreOrder());
    }
    //endregion

    //region DPS Post Order Testing
    public void testDPSPostOrder1()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(5);
        bst.add(3);
        bst.add(8);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(3);
        expectedResults.add(8);
        expectedResults.add(5);

        assertEquals(expectedResults,bst.dpsPostOrder());
    }

    public void testDPSPostOrder2()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(3);
        bst.add(5);
        bst.add(8);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(8);
        expectedResults.add(5);
        expectedResults.add(3);

        assertEquals(expectedResults,bst.dpsPostOrder());
    }

    public void testDPSPostOrder3()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(5);
        bst.add(8);
        bst.add(3);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(3);
        expectedResults.add(8);
        expectedResults.add(5);

        assertEquals(expectedResults,bst.dpsPostOrder());
    }

    public void testDPSPostOrder4()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

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

        expectedResults.add(16);
        expectedResults.add(10);
        expectedResults.add(22);
        expectedResults.add(21);
        expectedResults.add(7);
        expectedResults.add(32);
        expectedResults.add(53);
        expectedResults.add(49);
        expectedResults.add(78);
        expectedResults.add(87);
        expectedResults.add(92);
        expectedResults.add(84);
        expectedResults.add(71);
        expectedResults.add(96);
        expectedResults.add(93);
        expectedResults.add(92);
        expectedResults.add(63);
        expectedResults.add(44);
        expectedResults.add(32);
        expectedResults.add(31);

        assertEquals(expectedResults,bst.dpsPostOrder());
    }

    public void testDPSPostOrder5()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(8);
        bst.add(5);
        bst.add(3);

        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(3);
        expectedResults.add(5);
        expectedResults.add(8);

        assertEquals(expectedResults,bst.dpsPostOrder());
    }
    //endregion

}
