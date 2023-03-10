//
//
//  @ Project : hoja de trabajo 3
//  @ File Name : QuickSort.java
//  @ Date : 7/02/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
//
//
public class QuickSort 
{
     /**
     * @param A
     * @param izq
     * @param der
     * @return se introduce como parametro el array, y un elemento de la izquierda y otro de la derecha
     */
    public int[] quicksort(int A[], int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         //búsqueda de izquierda a derecha
        int j=der;         //búsqueda de derecha a izquierda
        int aux;
       
        while(i < j){                          // mientras no se topen las busquedas j e i                                 
           while(A[i] <= pivote && i < j) i++; // elemento mayor al pivote
           while(A[j] > pivote) j--;           // elemento menor al pivote
           if (i < j) {                        // si no cruzan, los intercambia                   
               aux= A[i];                      
               A[i]=A[j];
               A[j]=aux;
           }
         }
         
         A[izq]=A[j];                                        
         A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         
         if(izq < j-1)
            quicksort(A,izq,j-1);          //  subarray izquierdo
         if(j+1 < der)
            quicksort(A,j+1,der);          //  subarray derecho
         return A;
      }
      /**
     * @param arr se utiliza este método con un for para poder pasar el array a algo más visible
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
//fuente de codigo:http://puntocomnoesunlenguaje.blogspot.com/2012/12/java-quicksort.html
//Algoritmo de Quick sort encontrado en google.
