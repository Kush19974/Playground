import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        int freq[] = new int[70]; 
        for(int idx = 0; idx < 70; idx++){
            freq[idx] = 0;
        }
        for(int idx = 0; idx < str_len; idx++)
        {
            if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
            {
                int offset = sb.charAt(idx) - 'A';
                char ch = (char)('a' + offset);
                sb.setCharAt(idx, ch);
            }
            if(sb.charAt(idx) >= 'a' && sb.charAt(idx) <= 'z')
            {
                freq[sb.charAt(idx) - 'a']++;
            }  
        }
        for(int i = 0; i < str_len; i++)
        {
            if(freq[sb.charAt(i) -'a'] != 0)
            {
                System.out.print(sb.charAt(i) +"" +freq[sb.charAt(i)-'a'] + " ");
                freq[sb.charAt(i) -'a'] = 0;
            }
        }
    }
}