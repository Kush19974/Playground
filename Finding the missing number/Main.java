import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int index = 0; index < n; index++){
      array[index] = sc.nextInt();
    }
    int m = n+1;
    int array_comp[] = new int[m];
    for (int index = 0; index < m; index++){
      array_comp[index] = 0;
    }
    for (int index = 0; index < n; index++){
      for (int idx = 0; idx < m; idx++){
        if (array[index] == idx){
          array_comp[idx] = array_comp[idx] + 1;
        }
      }
    }
    for (int index = 1; index < m; index++){
      if (array_comp[index] == 0){
        System.out.println(index);
      }
    }
  }
}