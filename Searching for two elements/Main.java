import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arry[] = new int[n];
      for(int index = 0; index < n; index++)
      {
        arry[index] = sc.nextInt();
      }
      // take 2 elements which are to be searched
      int search_1 = sc.nextInt();
      int search_2 = sc.nextInt();
      // take two var to store index of searched variabe
      int search_idx_1 = -1;
      int search_idx_2 = -1;
      for (int index = 0; index < n; index++)
      {
        if (search_1 == arry[index])
        {
          search_idx_1 = index;
        }
        if (search_2 == arry[index])
        {
          search_idx_2 = index;
        }
      }
      System.out.println(search_idx_1);
      System.out.println(search_idx_2);
    }
}