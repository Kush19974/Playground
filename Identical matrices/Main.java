import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix_1[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix_1[i][j] = in.nextInt();
      }
    }
    
    int matrix_2[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix_2[i][j] = in.nextInt();
      }
    }
    boolean is_true = false;
    for (int i = 0; i < r; i++)
    {
      for (int j = 0; j < c; j++)
      {
        if (matrix_1[i][j] == matrix_2[i][j])
        {
          is_true = true;
        }
        else
        {
          is_true = false;
          break;
        }
      }
    }
    if (is_true == true)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}