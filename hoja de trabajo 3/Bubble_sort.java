//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : Bubble_sort.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
public class Bubble_sort {
    /** 
     * @param sort_arr
     * @param len
     * @return int[] el método usa como parametro el array y la longitud del array para poder hacer el sort
     */
    public int[] bubbleSort(int[] sort_arr, int len)
    {
        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(sort_arr[j+1]<sort_arr[j]){

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;

                }
            }
        }
        return sort_arr;
    }
        /**
     * @param arr método que pasa el array a un for para poder imprimirlo y que se vea de mejor manera
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
