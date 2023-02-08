//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : Radix_sortTest.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
import org.junit.Test;
import java.util.Arrays;
public class Radix_sortTest{
    Radix_sort radix = new Radix_sort();
    /**
     * método para poder comprobar si funciona el método radixsort o no
     */
    @Test
    public void testRadix()
    {
        int[] array = new int[]{3,1,4,7,8,2,6,10,9};
        radix.radixsort(array, 9);
        Arrays.equals(new int[]{1,2,3,4,5,6,6,7,8,9,10}, array);
    }
}