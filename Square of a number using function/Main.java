import java.util.Scanner;
class Main
{
  public static int square(int n){
    int sqr = n * n;
    return sqr;
  }
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int sqr1 = square(n1);
      System.out.println(sqr1);
	} 
}