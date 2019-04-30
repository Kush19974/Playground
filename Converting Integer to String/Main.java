import java.util.Scanner;
class Main{
  public static int str_to_int(String str){
    int i = 0; // intaial index value
    int num = 0;
    boolean is_neg = false;
    // check the number is nagative ??
    if (str.charAt(0) == '-'){
      is_neg = true;
      i = 1;
    }
    // get each charcter of string one by one
    while (i < str.length()){
      num = num * 10;
      // minus the ASCII code from '0' to get the value of the
      // charAt(i++)
      num = num + str.charAt(i++) - '0';
    }
    if (is_neg == true){
      num = - num;
    }
    return num;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int len = str.length();
    System.out.print(str_to_int(str));
  }
}

