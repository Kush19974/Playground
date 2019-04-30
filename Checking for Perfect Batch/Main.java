import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int index = 0; index < n; index++){
      array[index] = sc.nextInt();
    }
    perfect_batch(array, n);
  }
  public static void perfect_batch(int array[], int n){
    boolean p_batch = true;
    int sum_of_batch = array[0] + array[1] + array[2];
    for (int index = 3; index < n; index = index + 3){
      int sum_of_batch_next = array[index] + array[index + 1] + array[index + 2];
      if (sum_of_batch != sum_of_batch_next){
        p_batch = false;
      }
    }
    if (p_batch == true){
      System.out.println("Perfect Batch");
    }
    else{
      System.out.println("Not a Perfect Batch");
    }
  }
}