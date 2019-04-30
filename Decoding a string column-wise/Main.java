import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    String string = in.nextLine();
    int col_count = in.nextInt();
    StringBuilder str = new StringBuilder(string); 
    int str_len = str.length();
    delete_spaces(str, str_len);
    str_len = str.length();
    int row_count = str_len / col_count;
    if((str_len % col_count) > 0)
    {
      row_count++;
    }
    for(int col_idx = 0; col_idx < col_count; col_idx++)
    {
      for(int row_idx = 0; row_idx < row_count; row_idx++)
      {
        int curr_char_idx = col_idx + (row_idx * col_count);
        if(row_idx % 2 == 1)
        {
          int char_idx = (col_count - 1) + (row_idx * col_count);
          curr_char_idx = char_idx - col_idx;
        }
        char ch;
        if (curr_char_idx >= str_len)
        {
          ch = 'X';
          
          System.out.print(ch);
        }
        else if(curr_char_idx < str_len)
        {
          System.out.print(str.charAt(curr_char_idx));
        }
      }
    }
  }
  public static void delete_spaces(StringBuilder str, int str_len)
  {
    StringBuilder temp = new StringBuilder("");
    for(int i = 0; i < str_len; i++)
    {
      if(str.charAt(i) != ' ')
      {
        temp.append(str.charAt(i));
      }
    }
    str.setLength(0);
    int temp_len = temp.length();
    for(int i = 0; i < temp_len; i++)
    {
      str.append(temp.charAt(i));     
    }
  }
}