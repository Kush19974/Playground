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
    for (int index_1 = 0; index_1 < n-1; index_1++){
      for (int index_2 = index_1 + 1; index_2 < n; index_2++){
        if (array[index_1] < array[index_2]){
          System.out.println(array[index_1] +  "," + array[index_2]);
        }
      }
    }
  }
}