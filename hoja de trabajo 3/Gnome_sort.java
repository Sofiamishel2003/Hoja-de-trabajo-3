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
