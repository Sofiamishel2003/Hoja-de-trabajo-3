import org.junit.Test;
import java.util.Arrays;
public class quickSortTest{
    QuickSort rapido = new QuickSort();
    @Test
    public void testQuickSort()
    {
        int[] array = new int[]{3,1,4,7,8,2,6,10,9};
        rapido.quicksort(array, 0, array.length -1);
        Arrays.equals(new int[]{1,2,3,4,5,6,6,7,8,9,10}, array);
    }
}
