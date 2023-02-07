import org.junit.Test;
import java.util.Arrays;
public class Bubble_sortTest{
    Bubble_sort burbuja = new Bubble_sort();
    @Test
    public void testBubblesort()
    {
        int[] array = new int[]{3,1,4,7,8,2,6,10,9};
        burbuja.bubbleSort(array, 9);
        Arrays.equals(new int[]{1,2,3,4,5,6,6,7,8,9,10}, array);
    }
}