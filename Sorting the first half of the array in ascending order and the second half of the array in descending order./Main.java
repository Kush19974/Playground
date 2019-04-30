import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int i = 0; i < n; i++){
      array[i] = sc.nextInt();
    }
    first_half_sort(n,array);
    second_half_sort(n,array);
  }
  public static void first_half_sort(int n, int list[]){
    for (int idx1 = 1; idx1 < n/2; idx1++) 
    {
      int key = list[idx1];
      int idx2 = idx1 - 1;
      while((idx2 >= 0) && (list[idx2] > key)) 
      {
        list[idx2 + 1] = list[idx2];
        idx2--;
      }
      list[idx2 + 1] = key;
    }
    for(int i = 0; i < n/2; i++)
    {
      System.out.print(list[i]+" ");
    }
  }
  public static void second_half_sort(int n, int array[]){
    for (int i = 0; i < n; i++){
      for (int j = n/2; j < n-1-i; j++){
        if (array[j] < array[j+1]){
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    for (int i = n/2; i < n; i++){
      System.out.print(array[i]+ " ");
    }
  }
}
