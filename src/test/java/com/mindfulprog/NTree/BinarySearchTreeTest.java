package com.mindfulprog.NTree;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    public void testDPSInOrder()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(5);
        bst.add(3);
        bst.add(8);

        //assertEquals([3, 5, 8],bst.dpsInOrder());
    }

    public void testDPSPreOrder()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(5);
        bst.add(3);
        bst.add(8);

        //assertEquals([3, 5, 8],bst.dpsPreOrder());
    }

    public void testDPSPostOrder()
    {
        NBinarySearchTree<Integer> bst = new NBinarySearchTree();

        bst.add(5);
        bst.add(3);
        bst.add(8);

        //assertEquals([3, 5, 8],bst.dpsPostOrder());
    }
}
