import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int copy_number = n;
      int sum = 0;
      while (n > 0){
        int rem = n % 10;
        int fact = 1;
        // find factorial for each digit
        for (int count = 1; count <= rem; count++){
          fact = fact * count;
        }
        sum = sum + fact;
        n = n /10;
      }
      if (sum == copy_number){
        System.out.println("Yes");
      }
      else {
        System.out.println("No");
      }
	}
}