import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(factorial(n));
  }
  public static int factorial(int n)
  {
    if (n == 0)
    {
      return 1;
    }
    else if (n == 1)
    {
      return 1;
    }
    else 
    {
      return n * factorial(n-1);
    }
  }
}