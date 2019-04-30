import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int array[] = new int[n];
    for (int index = 0; index < n; index++){
      array[index] = sc.nextInt();
    }
    int freq[] = new int[k];
    for (int index = 0; index < k; index++){
      freq[index] = 0;
    }
    for (int idx = 0; idx < n; idx++){
      freq[array[idx] -1]++;
    }
    for (int id = 0; id < k; id++){
      System.out.println((id+1) + " " + freq[id]);
    }
  }
}