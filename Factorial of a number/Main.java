import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int fact = 1;
      for (int count = 1; count <=n ; count++){
        fact = fact * count;
      }
      System.out.println(fact);
	}
}