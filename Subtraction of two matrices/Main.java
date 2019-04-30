import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    // first matrix
    int matrix_1[][] = new int[row][col];
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++)
      {
        matrix_1[i][j] = sc.nextInt();
      }
    }
    // second matrix 
    int matrix_2[][] = new int[row][col];
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++)
      {
        matrix_2[i][j] = sc.nextInt();
      }
    }
    
    // substractic two matrix
    int diff = 0;
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++)
      {
        diff = matrix_1[i][j] - matrix_2[i][j] ;
        System.out.print(diff+" ");
      }
      System.out.print("\n");
    }
  }
}