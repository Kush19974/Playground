import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String r = removal_of_vowels(str);
    System.out.print(r);
  }
  public static String removal_of_vowels(String str){
    String finalString = "";
    for (int i = 0; i < str.length(); i++){
      if (!is_vowel(Character.toLowerCase(str.charAt(i)))){
        finalString = finalString + str.charAt(i);
      }
    }
    return finalString;
  }
  public static boolean is_vowel(char c){
    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
    {    
      return true;
    }    
    else
    {
      return false;
    }    
  }
}
