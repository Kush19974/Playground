import java.util.Scanner;
class Main{
  public static void zero_print_last(int n, int array[]){
    // count zeros
    int count = 0;
    // travers the array. if arr[index] is non zero, then
    // swap the element at array[index] and array[count]
    for (int index = 0; index < n; index++){
      if (array[index] != 0){
        int temp = array[index];
        array[index] = array[count];
        array[count] = temp;
        count++;
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
    // call funcation
    zero_print_last(n,array);
    for (int index = 0; index < n; index++){
      System.out.print(array[index] + " ");
    }
  }
}
