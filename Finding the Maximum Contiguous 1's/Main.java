import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int index = 0; index < n; index++){
      array[index] = sc.nextInt();
    }
    int freq[] = new int[n];
    int idx = repet_count(array,n,freq);
    int max = find_max_no(freq, n, idx);
    System.out.println(max);
  }
  public static int repet_count(int array[], int n, int freq[]){
    
    int index = 0;
    int count = 0;
    int freq_idx = 0;
    for (index = 0; index < n; index++){
      if (array[index] == 1){
        count++;
      }
      if ((array[index] == 0) || (index == n-1)){
        freq[freq_idx] = count;
        count = 0;
        freq_idx++;
      }
    }
    return freq_idx - 1;
  }
  public static int find_max_no(int freq[], int n, int idx){
    int max_no = 0;
    if ((freq[0] > freq[1]) || idx == 0){
      max_no = freq[0];
    }
    else {
      max_no = freq[1];
    }
    for (int i = 2; i < idx; i++){
      if (max_no < freq[idx]){
        max_no = freq[idx];
      }
    }
    return max_no;
  }
}