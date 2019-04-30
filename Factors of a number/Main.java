import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      // check all number from 1 to n and print numbers which are
      // the factors of n
      for (int factor = 1; factor <= n; factor++)
      {
        if (n % factor == 0)
        {
          System.out.println(factor);
        }
      }
	}
}