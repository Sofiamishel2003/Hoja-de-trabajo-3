//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : Bubble_sortTest.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
import org.junit.Test;
import java.util.Arrays;
public class Bubble_sortTest{
    Bubble_sort burbuja = new Bubble_sort();
    /**
     *  Test del metodo bubble sort para ver si funciona bien o no
     */
    @Test
    public void testBubblesort()
    {
        int[] array = new int[]{3,1,4,7,8,2,6,10,9};
        burbuja.bubbleSort(array, 9);
        Arrays.equals(new int[]{1,2,3,4,5,6,6,7,8,9,10}, array);
    }
}