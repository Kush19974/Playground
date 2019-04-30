import java.util.Scanner;
class Main 
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    // Get the input from user
    int n = in.nextInt();
    int flag = 0;
    for (int row = 1; row <= n; row++)
    {
      for (int col = 1; col <= row; col++)
      {
        if (flag == 0)
        {
          System.out.print("*");
          flag = 1;
        }
        else 
        {
          System.out.print("#");
          flag = 0;
        }
      }
      System.out.print("\n");
    }
    in.close();
  }
}