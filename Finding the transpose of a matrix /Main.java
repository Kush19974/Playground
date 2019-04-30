import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int matrix[][] = new int[row][col];
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col ; j++)
      {
        matrix[i][j] = sc.nextInt();
      }
    }

    //transpose of matrix
    int transpose[][] = new int[col][row];
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++)
      {
        transpose[j][i] = matrix[i][j];
        System.out.print(transpose[j][i] + " ");
      }
      System.out.print("\n");
    }
  }
}