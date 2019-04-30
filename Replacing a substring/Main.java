import java.util.Scanner;
class Main{
 
 public static void main(String[] args) 
  { 
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder sb3 = new StringBuilder(str3);
        StringBuilder temp = new StringBuilder("");
        int sb1_len = sb1.length();
        int sb2_len = sb2.length();
        int sb3_len = sb3.length();
   		int i, j;
        for(i = 0; i <= (sb1_len - 1) - (sb2_len - 1); i++)
        {
            boolean is_matching = true;
            for(j = 0; j < sb2_len; j++)
            {
                if(sb1.charAt(i + j) != sb2.charAt(j))
                {
                    is_matching = false;
                }
            }
            if(is_matching == true)
            {
              String strng = sb3.substring(0, sb3_len);
              temp.append(strng);
              i = i + (sb2_len - 1);
            }
            else
            {
                char ch = sb1.charAt(i);
                temp.append(ch);
            }
        }
        for(j = i ; j <= (sb1_len - 1); j++)
        {
                char ch = sb1.charAt(j);
                temp.append(ch);
        }
        System.out.print(temp);
    }
}