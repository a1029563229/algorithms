/**
 *
 */
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Macxdouble
 *
 */
public class SortTest {

    @Test
    public void testSortByInsert() {
        int [] arr1 = new int[] { 1 };
        int [] arr2 = new int[] { 2, 1 };

        int [] arr3 = new int[] { 412, 92, 323, -4, 115, 26, 71, 48, 29 };
        Sort insertSort = new InsertSort();
        Assert.assertArrayEquals( new int[]{ 1 }, insertSort.sort(arr1));
        Assert.assertArrayEquals(new int[]{ 1, 2 }, insertSort.sort(arr2));
        Assert.assertArrayEquals(new int[]{ -4, 26, 29, 48, 71, 92, 115, 323, 412 }, insertSort.sort(arr3));
    }
}
