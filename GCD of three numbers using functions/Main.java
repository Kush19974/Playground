import java.util.Scanner;
public class Main{
  public static int Great(int a,int b,int c){
    int min,gcd = 0;
    if (a < b){
      if (a < c){
        min = a;
      }
      else{
        min = c;
      }
    }
    else if (b < c){
      min = b;
    }
    else {
      min = c;
    }
    while (min >= 1){
      if ((a % min == 0) && (b % min == 0) && (c % min == 0)){
        gcd = min;
        break;
      }
      min--;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      System.out.print(Great(n1,n2,n3));
	}
}