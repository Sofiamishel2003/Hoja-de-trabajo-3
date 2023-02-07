import org.junit.Test;
import java.util.Arrays;
public class Merge_sortTest{
    Merge_sort merge = new Merge_sort();
    @Test
    public void mergesortTest()
    {
        int[] array = new int[]{3,1,4,7,8,2,6,10,9};
        merge.mergeSort(array, 5,2);
        Arrays.equals(new int[]{1,2,3,4,5,6,6,7,8,9,10}, array);
    }
}