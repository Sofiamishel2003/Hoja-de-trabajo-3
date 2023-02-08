//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : Gnome_sortTest.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
import org.junit.Test;
import java.util.Arrays;
public class Gnome_sortTest{
    Gnome_sort gnomo = new Gnome_sort();
    /**
     *  test para poder comprobar si el método gnomesort funciona o no
     */
    @Test
    public void testGnome()
    {
        int[] array = new int[]{3,1,4,7,8,2,6,10,9};
        gnomo.GnomeSort(array, 9);
        Arrays.equals(new int[]{1,2,3,4,5,6,6,7,8,9,10}, array);
    }
}