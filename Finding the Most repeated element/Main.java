import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int index = 0; index < n; index++){
      array[index] = sc.nextInt();
    }
    int freq[] = new int[n];
    System.out.print(find_freq_element(array,n,freq));
  }
  public static int find_freq_element(int array[], int n, int freq[]){
    int max_idx = 0; 
    int curr_count = 1;
    
    for (int i = 0; i < n; i++){
      for (int j = i+1; j < n; j++){
        if (array[i] == array[j]){
          curr_count++;
        }
        freq[i] = curr_count;
        curr_count = 1;
      }
    }
    for (int i = 0; i < n; i++){
      if (freq[i] > freq[max_idx]){
        max_idx = i;
      }
    }
    return array[max_idx];
  }
}