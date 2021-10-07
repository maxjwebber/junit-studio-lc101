package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    private final int[] a123 = new int[]{1, 2, 3};
    private final int[] a02468200 = new int[]{0,2,4,6,8,200};

    @Test
    public void canGetMiddleIndex123() {
        assertEquals(1,BonusBinarySearch.binarySearch(a123,2));
    }

    @Test
    public void canGetFirstIndex123() {
        assertEquals(0,BonusBinarySearch.binarySearch(a123,1));
    }

    @Test
    public void canGetLastIndex123() {
        assertEquals(2,BonusBinarySearch.binarySearch(a123,3));
    }

    @Test
    public void cannotFind7In123() {
        assertEquals(-1,BonusBinarySearch.binarySearch(a123,7));
    }

    @Test
    public void canFind0in02468200() {
        assertEquals(0,BonusBinarySearch.binarySearch(a02468200,0));
    }

    @Test
    public void canFind2in02468200() {
        assertEquals(1,BonusBinarySearch.binarySearch(a02468200,2));
    }

    @Test
    public void canFind4in02468200() {
        assertEquals(2,BonusBinarySearch.binarySearch(a02468200,4));
    }

    @Test
    public void canFind6in02468200() {
        assertEquals(3,BonusBinarySearch.binarySearch(a02468200,6));
    }

    @Test
    public void canFind8in02468200() {
        assertEquals(4,BonusBinarySearch.binarySearch(a02468200,8));
    }

    @Test
    public void canFind200in02468200() {
        assertEquals(5,BonusBinarySearch.binarySearch(a02468200,200));
    }

    @Test
    public void cannotFind7in02468200() {
        assertEquals(-1,BonusBinarySearch.binarySearch(a02468200,7));
    }
}
