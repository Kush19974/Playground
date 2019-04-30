import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    int max_index;
    for (int index = 0; index < n; index++){
      array[index] = sc.nextInt();
    }
    if (array[0] > array[1]){
      max_index = 0;
    }
    else{
      max_index = 1;
    }
    for (int index = 2; index < n; index++){
      if (array[max_index] < array[index]){
        max_index = index;
      }
    }
    System.out.println(max_index);
  }
}