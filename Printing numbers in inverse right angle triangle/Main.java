import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int val = n;
      for (int row = 1; row <= n; row++){
        // Handel number for each row
        for (int col = val; col >= 1; col--){
          System.out.print(col);
        }
        val = val -1;
        System.out.print("\n");
      }
	}
}