import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int i = 0; i < n; i++)
    {
      array[i] = sc.nextInt();
    }
    half_sort(n,array);
  }
  public static void half_sort(int n, int list[])
  {
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
    for(int i = 0; i < n; i++)
    {
      System.out.print(list[i]+" ");
    }
  }
}
