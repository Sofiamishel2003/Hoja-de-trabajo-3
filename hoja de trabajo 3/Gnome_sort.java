public class Gnome_sort {
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
    public static void show(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
