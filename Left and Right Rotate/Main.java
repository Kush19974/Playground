import java.util.Scanner;
class Main 
{
    public static void left_rotate_even_elem(int arr_size, int arr[], int no_of_rotation)
    {
       int first_even_elem_index = 1;
       int last_even_elem_index;
       if(arr_size % 2 == 0)
       {
           last_even_elem_index = arr_size - 1;
       }
       else
       {
           last_even_elem_index = arr_size - 2;
       }
       for(int rotation = 1; rotation <= no_of_rotation; rotation++)
       {
           int temp = arr[first_even_elem_index];
           for(int index = 3; index < arr_size; index = index + 2)
           {
               arr[index - 2] = arr[index];
           }
           arr[last_even_elem_index] = temp;
       }
    }
    public static void right_rotate_odd_elem(int arr_size, int arr[], int no_of_rotation)
    {
       int first_odd_elem_index = 0;
       int last_odd_elem_index;
       if(arr_size % 2 == 1)
       {
          last_odd_elem_index = arr_size - 1;
       }
       else
       {
          last_odd_elem_index = arr_size - 2;
       }
       for(int rotation = 1; rotation <= no_of_rotation; rotation++)
       {
           int temp = arr[last_odd_elem_index];
           for(int index = (last_odd_elem_index - 2); index >= 0; index = index - 2)
            {
               arr[index + 2] = arr[index];
           }
           arr[first_odd_elem_index] = temp;
       }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index <= (arr_size - 1); index++)
        {
            arr[index] = in.nextInt();
        }
        int no_of_rotation = in.nextInt();
        left_rotate_even_elem(arr_size, arr, no_of_rotation);
        right_rotate_odd_elem(arr_size, arr, no_of_rotation);
    
    for(int index = 0; index <= (arr_size - 1); index++)
        {
            System.out.print(arr[index]+" ");
        }
    }
}