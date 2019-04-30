import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int copy_number = number;
      int digit_count = 0;
      // find the digit count
      if (number == 0){
        System.out.println(number);
      }
      else{
        while (number > 0){
          digit_count++;
          number = number / 10;
        }
      }
      number = copy_number;
      int sum = 0;
      int power = 1;
      // Extract each digit and comput the power for it 
      // and add all them. If sum = number the Amstrong number else not Amstrong number
      while (number > 0){
        int last_digit = number % 10;
        for (int count = 1;count <= digit_count; count++){
          power = power * last_digit;
        }
        sum = sum + power;
        power = 1;
        number = number / 10;
      }
      if (sum == copy_number){
        System.out.println("Armstrong Number");
      }
      else{
        System.out.println("Not a Armstrong Number");
      }
	}
}