import org.junit.Test;
import java.util.Arrays;
public class Radix_sortTest{
    Radix_sort radix = new Radix_sort();
    @Test
    public void testRadix()
    {
        int[] array = new int[]{3,1,4,7,8,2,6,10,9};
        radix.radixsort(array, 9);
        Arrays.equals(new int[]{1,2,3,4,5,6,6,7,8,9,10}, array);
    }
}