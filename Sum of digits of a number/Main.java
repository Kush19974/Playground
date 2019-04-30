import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      // intial sum is 0 
      int sum = 0;
      
      // extract last digit till the number end
      // and add it in the sum
      while (n > 0)
      {
        // extracting last digit
        int rem = n % 10;
        
        //add last digit in sum
        sum = sum + rem;
        
        //removing last digit
        n = n / 10;
      }
      System.out.println(sum);
	}
}