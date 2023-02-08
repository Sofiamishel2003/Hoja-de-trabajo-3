//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : Merge_sortTest.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
import org.junit.Test;
import java.util.Arrays;
public class Merge_sortTest{
    Merge_sort merge = new Merge_sort();
    /**
     * método para poder comprobar si el método mergeSort funciona o no
     */
    @Test
    public void mergesortTest()
    {
        int[] array = new int[]{3,1,4,7,8,2,6,10,9};
        merge.mergeSort(array, 5,2);
        Arrays.equals(new int[]{1,2,3,4,5,6,6,7,8,9,10}, array);
    }
}