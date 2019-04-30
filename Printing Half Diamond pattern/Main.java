import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int row = 1; row <= n; row++){
        // Handel spaces in each row
        for (int spaces = 1; spaces <= (n - row); spaces++){
          System.out.print(" ");
        }
        // Handel star in each row
        for (int col = 1; col <= (2 * row - 1); col++){
          System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}