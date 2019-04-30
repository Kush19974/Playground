import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int index = 0; index < n; index++){
      array[index] = sc.nextInt();
    }
    int count_t = 0;
    int count_f = 0;
    for (int index = 0; index < n/2; index++){
      for (int idx = n-1; idx > n/2; idx--){
        if (array[index] == array[idx]){
          count_t++;
          index = index + 1;
        }
        else if (array[index] != array[idx]){
          count_f++;
          index = index + 1;
        }
      }
    }
    if (count_f == 0){
      System.out.print("Yes");
    }
    else {
      System.out.print("No");
    }
  }
}