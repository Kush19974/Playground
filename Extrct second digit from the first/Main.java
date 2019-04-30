import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n >= 100)
    {
      n = n / 10;
    }
    int second_digit = n % 10;
    System.out.println(second_digit);
  }
}