import java.lang.*;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    int no_of_parts = sc.nextInt();
    str2 = str1.replaceAll(str1,str2);
    
    for (int i = 0; i < str2.length(); i++)
    {

      if (str2.charAt(i) != ' ')
      {
        System.out.print(str2.charAt(i));
      }
      else if (str2.charAt(i) == ' ')
      {
        System.out.print("\n");
        no_of_parts--;
      }
      if (no_of_parts == 0)
        break;
    }
  }
}