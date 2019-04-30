import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int shape = sc.nextInt();
    switch (shape)
    {
      case 1:
        int side = sc.nextInt();
        System.out.print(side*side);
        break;
      case 2:
        int len = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.print(len * breadth);
        break;
      case 3:
        int base = sc.nextInt();
        int height = sc.nextInt();
        double result = ((base*height)/2);
        System.out.print(result);
        break;
      case 4:
        int radius = sc.nextInt();
        double area = (3.14 * radius * radius);
        System.out.print(area);
    }
  }
}