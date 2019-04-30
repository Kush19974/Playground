import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String words[] = new String[n];
    for (int i = 0; i < n; i++)
    {
      words[i] = sc.next();
    } 
    for (int i = 0; i < n; i++)
    {
      int ch = words[i].charAt(0);
      if (ch > 64 && ch < 91)
      {
        String str = words[i];
        char chr[] = str.toCharArray();
        ch = ch + 32;
        chr[0] = (char)ch;
        words[i] = new String(chr);
      }
    }
    for (int i = 0; i < n-1; i++)
    {
      for (int j = i+1; j < n; j++)
      {
        if (words[i].charAt(0) > words[j].charAt(0))
        {
          String temp = words[i];
          words[i] = words[j];
          words[j] = temp;
        }
      }
    }
    for (int i = 0; i < n; i++)
    {
      System.out.println(words[i]);
    }
  }
}