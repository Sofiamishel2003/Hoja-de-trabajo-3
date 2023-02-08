//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : Merge_sort.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
public class Merge_sort {
  /**
   * @param arr
   * @param p
   * @param q
   * @param r Merge two subarrays L and M into arr
   */
  public void merge(int arr[], int p, int q, int r) {

    // Create L ← A[p..q] and M ← A[q+1..r]
    int n1 = q - p + 1;
    int n2 = r - q;
    int L[] = new int[n1];
    int M[] = new int[n2];
    for (int i = 0; i < n1; i++)
      L[i] = arr[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = arr[q + 1 + j];
    int i, j, k;
    i = 0;
    j = 0;
    k = p;
    // Mientras uno alcance el final de L o M escoger escoger el que tenga mayor elementos L y M y ponerlos en la posicion correcta
    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = M[j];
        j++;
      }
      k++;
    }
    // Cuando se acaben los elementos en L o M pasar los elementos sobrantes a A[p..r]
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }
    while (j < n2) {
      arr[k] = M[j];
      j++;
      k++;
    }
  }

    
  /**
   * @param arr
   * @param l
   * @param r
   * @return  Dividir los arrays 
   */
  public int[] mergeSort(int arr[], int l, int r) {
    if (l < r) {
      int m = (l + r) / 2;
      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);
      merge(arr, l, m, r);
    }
    return arr;
  }
  /**
   * @param arr pasar el array a algo más visible con un for
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
