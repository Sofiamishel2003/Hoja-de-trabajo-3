import java.util.Random;
public class Main {
	public static void main(String[] args) 
    {
        //Numeros random en un string listos para escribir en el archivo
        String numeros_random="";
        Random random = new Random();
        for(int i = 0; i < 30; i++)
        {
            int value = random.nextInt(3000 + 1) + 1;
            numeros_random=numeros_random+value+" ";
        }
        System.out.println(numeros_random);
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;

        //---------------Gnome
        //Gnome_sort gnome = new Gnome_sort();
        //int arr2[] =gnome.GnomeSort(arr, n);
        //gnome.show(arr2);
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

