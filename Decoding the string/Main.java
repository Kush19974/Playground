import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int len = sb.length();
    int key = sc.nextInt();
    for (int idx = 0; idx < len; idx++)
    {
      char ch = sb.charAt(idx);
      if (ch >= 'A' && ch <= 'Z')
      {
        ch = (char) (ch - key);
        if (ch < 'A')
        {
          ch = (char)(ch + 26);
        }
      }
      if (ch >= 'a' && ch <= 'z')
      {
        ch = (char) (ch - key);
        if (ch < 'a')
        {
          ch = (char)(ch + 26);
        }
      }
      sb.setCharAt(idx,ch);
    }
    System.out.print(sb);
  }
}