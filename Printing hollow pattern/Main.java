import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int row = 1; row <= n; row++){
        for (int col = 1; col <= n; col++){
          if((row == 1)||(row == n)||(col == 1)||(col ==n))
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
	}
}