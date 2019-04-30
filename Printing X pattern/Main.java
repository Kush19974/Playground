import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int row = 1; row <= n; row++){
        for (int col = 1; col<= n; col++){
           // heandle the star in current row and col
          if (row == col || row + col == n +1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
	}
}