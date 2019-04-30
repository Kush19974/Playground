import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int val = 1;
      for (int row = 1; row <= n; row++){
        // handel the spaces for each row
        for (int space = 1; space <= (n - row); space++){
          System.out.print(" ");
        }
        // handel the numers in each col
        for (int col = 1; col <= row; col++){
          System.out.print(val + " ");
          val = val + 1;
        }
        System.out.print("\n");
      }
    }    
}