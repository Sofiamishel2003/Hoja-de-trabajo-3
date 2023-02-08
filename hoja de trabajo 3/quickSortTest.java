//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : quickSortTest.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
import org.junit.Test;
import java.util.Arrays;
public class quickSortTest{
    QuickSort rapido = new QuickSort();
    /**
     *  método para poder comprobar si el método quicksort funciona o no
     */
    @Test
    public void testQuickSort()
    {
        int[] array = new int[]{3,1,4,7,8,2,6,10,9};
        rapido.quicksort(array, 0, array.length -1);
        Arrays.equals(new int[]{1,2,3,4,5,6,6,7,8,9,10}, array);
    }
}
