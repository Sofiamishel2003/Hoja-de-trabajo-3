//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : Gnome_sort.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
public class Gnome_sort {
    /** 
     * @param sort_arr
     * @param len
     * @return int[] método que usa como parametro el array donde están los números y la longitud del mismo
     */
    public int[] GnomeSort(int[] sort_arr, int len)
    {
        int index = 0;

        while (index < len) {
            if (index == 0)
                index++;
            if (sort_arr[index] >= sort_arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = sort_arr[index];
                sort_arr[index] = sort_arr[index - 1];
                sort_arr[index - 1] = temp;
                index--;
            }
        }
        return sort_arr;
    }
    /**
     * @param arr método para pasar el array a algo más visible con un for
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
