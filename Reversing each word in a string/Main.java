import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    reverse_each_word_of_string(str);
    
  }
  public static void reverse_each_word_of_string(String str)
  {
    String words[] = str.split(" ");
    String reverse_string = "";
    for (int i = 0; i < words.length; i++)
    {
      String word = words[i];
      String reversed_word = "";
      for (int j = word.length() - 1; j >= 0; j--)
      {
        reversed_word = reversed_word + word.charAt(j);
      }
      reverse_string = reverse_string + reversed_word + " ";
    }
    System.out.println(reverse_string);
  }
}