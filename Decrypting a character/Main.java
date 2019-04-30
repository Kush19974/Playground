import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      int key = sc.nextInt();
      if (ch >= 'a' && ch <= 'z'){
        int offset = ch - 'a';
        offset = (offset - key) % 26;
        if (offset < 0){
          int offset_1 = offset + 26;
          ch = (char) (offset_1 + 'a');
        }
        else {
        ch = (char) (offset + 'a');
        }
      }
      else if (ch >= 'A' && ch <= 'Z'){
        int offset = ch - 'A';
        offset = (offset - key) % 26;
        if (offset < 0){
          int offset_2 = offset + 26;
          ch = (char) (offset_2 + 'A');
        }
        else{
        ch = (char) (offset + 'A');
        }
      }
      System.out.print(ch);
    }
}