//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : Radix_sort.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
import java.io.*;
import java.util.*;
public class Radix_sort {
    /**
     * @param arr
     * @param n
     * @return
     */
    static int maxi(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    /**
     * @param arr
     * @param n
     * @param exp
     */
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
         for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
         for (i = 1; i < 10; i++) //cambia count[i] para que count[i] ahora tenga la posición actual del digito output[]
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) { // Ingresan los datos en el array final
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)// Se iguala el array inicial con el ordenado
            arr[i] = output[i];
    }
    static int[] radixsort(int arr[], int n)
    {
        int m = maxi(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
        return arr;

    }
    /**
     * @param arr se usa este método para poder pasar el array a algo más visible con un for
     */
   public String show(int[] arr)
    {
        int n = arr.length;
        String text="";
        for (int i = 0; i < n; ++i)
        {
            System.out.print(arr[i] + " ");
            text = text + arr[i] + " ";
        }
        System.out.println();
        return  text;
    }
}
//Fuente de consulta de código : https://www.geeksforgeeks.org/radix-sort/
//Descripción: algoritmo del sort de Radix
