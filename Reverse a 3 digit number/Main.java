import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    // Get the input from user
    int n = sc.nextInt();
    int first_digit = n / 100;
    int second_digit = (n % 100) / 10;
    int third_digit = (n % 10);
    int reverse_number =(third_digit*100 + second_digit*10 + first_digit);
    System.out.println(reverse_number);
  }
}