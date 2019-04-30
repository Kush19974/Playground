import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = str.length();
    int mid = n/2;
    for(int i = n-1; i >= 0 ; i--){
      int count = 0;
      for(int s = 0;s < i; s++){
        System.out.print(" ");
        count++;
      }
      if(i>=n/2){
        int j = n/2; 
        while(count<n){
          System.out.print(str.charAt(j++));
          count++;
        }
      }
      else{
        int j = n/2;
        while(count<=(n/2+i)){
          System.out.print(str.charAt(j++));
          count++;
        }
        j = 0;
        while(count < n){
          System.out.print(str.charAt(j++));
          count++;
        }
      }
      System.out.println();
    }
  }
}