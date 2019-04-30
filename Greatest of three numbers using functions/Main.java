import java.util.Scanner;
class Main{
  public static int greatest_no(int a,int b,int c){
    int great = 0;
    if (a > b){
      if (a > c){
        great = a;
      }
      else{
        great = c;
      }
    }
    else if (b > c){
      great = b;
    }
    else {
      great = c;
    }
    return great;
  }
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      System.out.print(greatest_no(n1,n2,n3));
	}
}