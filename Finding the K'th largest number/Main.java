import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
        int k = sc.nextInt();
        // Sorting the given array and printing the kth largest number
        selection_sort(n, arr);
        System.out.println(arr[n-k]);
    }
    public static void selection_sort(int n, int arr[]){
        for(int start_idx = 0; start_idx < n - 1; start_idx++)
        {
            int min_idx = find_minimun_idx(start_idx, arr, n-1);
            swap(start_idx, min_idx, arr);
        }
    }
     public static void swap(int start_idx, int min_idx, int arr[]){
         int temp = arr[start_idx];
         arr[start_idx] = arr[min_idx];
         arr[min_idx] = temp;
     }
     public static int find_minimun_idx(int start_idx, int arr[], int end_idx){
         int min_idx = 0;
         if(arr[start_idx] < arr[start_idx + 1])
         {
             min_idx = start_idx;
         }
         else{
             min_idx = start_idx + 1;
         }
         for(int i = start_idx + 2; i <= end_idx; i++){
             if(arr[min_idx] > arr[i])
             {
                 min_idx = i;
             }
         }
         return min_idx;
     }
}
