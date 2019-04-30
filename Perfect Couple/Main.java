import java.util.Scanner;
class Main{
  public static void pair(int n, int array[], int value){
    int sum = 0;
    for (int index = 0; index < n; index++){
      for (int idx = index + 1; idx < n; idx++){
        sum = array[index] + array[idx];
        if (sum == value){
          System.out.print(array[index] + ", " + array[idx]);
          System.out.print("\n");
        }
      }
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int index = 0; index < n; index++){
      array[index] = sc.nextInt();
    }
    int value = sc.nextInt();
    pair(n, array, value);
  }
}