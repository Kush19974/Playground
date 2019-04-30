import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    // Take numbers from 2 to given number
	    // Check each number until it reaches the given number
	    for(int i = 2; i <= n; i++)
	    {
	        if(is_prime(i))// Function call
	        {
	            System.out.println(i);
	        }
	    }
	    
	}
	// Function to find the prime number
	public static boolean is_prime(int m)
	{
	    boolean isprime = true;
	    for(int num = 2; num <= m/2; num++)
	    {
	        if(m % num == 0)
	        {
	            isprime = false;
	            break;
	        }
	    }
	    return isprime;
	}
}// End of Main class