import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int index = 0; index < n; index++){
      array[index] = sc.nextInt(); 
    }
    System.out.println(max_sum(array, n));
  }
  public static int max_sum(int array[], int n){
      
      int running_sum = array[0]; // running_sum = element at index[0]
      int max_sum = array[0];  // max_sum = running_sum initialy
      for (int i = 1; i < n; i++){
        if (array[i] > array[i-1]){
          running_sum = running_sum + array[i]; // running_sum = running_sum + 
        }
        else{
          running_sum = array[i];
        }
        if (running_sum > max_sum){
          max_sum = running_sum;
        }
      }
      return max_sum;
    }
}