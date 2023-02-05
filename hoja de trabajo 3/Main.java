import java.util.Random;
import java.util.ArrayList; //Import Arraylist
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
    {
        //Numeros random en un string listos para escribir en el archivo
        String numeros_random="";
        archivo file = new archivo();
        Random random = new Random();
        //cantidad de numeros a calcular
        int cantidad = 10;
        ArrayList<String> lineas;
        for(int i = 0; i < cantidad; i++)
        {
            int value = random.nextInt(cantidad + 1) + 1;
            numeros_random=numeros_random+value+" ";
        }
        //Creación de archivo, verifica si existe usa ese y si no crea uno nuevo.
        file.create_file(); //tiene que crear el archivo antes que nada
        file.write_file(numeros_random); //tiene que 
        int[] arr = new int[cantidad];
        int n = arr.length;
        int j=0;
        lineas=file.read_file();
        for (String str : lineas) 
	      {
            String[] line = str.split(" ");
            for (int i = 0; i < line.length; i++) 
            {
                arr[j] = Integer.parseInt(line[i]);
                j=j+1;
            }
	      }
        //---------------Gnome
        Gnome_sort gnome = new Gnome_sort();
        int arr2[] =gnome.GnomeSort(arr, n);
        gnome.show(arr2);
        //---------------Radix
        //Radix_sort radix = new Radix_sort();
        //int arr2[] =radix.radixsort(arr, n);
        //radix.show(arr2);
        //---------------Bubble
        //Bubble_sort burbuja = new Bubble_sort();
        //int arr2[] =burbuja.bubbleSort(arr, n);
        //burbuja.show(arr2);
        //---------------Merge
        //Merge_sort merge = new Merge_sort();
        //int arr2[] =merge.mergeSort(arr, 0, n - 1);
        //merge.show(arr2);
        //---------------Quick
        //QuickSort quick = new QuickSort();
        //int arr2[] =quick.quicksort(arr,0, n-1);
        //quick.show(arr2);
    }
}

