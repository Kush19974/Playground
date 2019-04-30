import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int star = 1; star <= n; star++)
    {
      System.out.println("*");
    }
  }
}