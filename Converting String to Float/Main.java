import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int length = s.length();
        double aftDec = 0;
        double befDec = 0;
        int flag =0;
        for(int i = 0; i<length; i++){
            if(s.charAt(i)=='.')
            flag = 1;
        }
        if(flag == 1){
            for (int i = length - 1 ; s.charAt(i)!= '.' && i >= 0; i--){
                aftDec = aftDec/10 + (s.charAt(i)-'0');
            }
            aftDec = aftDec/10;
            for (int i = 0 ; s.charAt(i)!= '.' ; i++){
                befDec = befDec*10 + (s.charAt(i)-'0');
            }
        }
        else{
            for (int i = 0 ; i<length ; i++){
                befDec = befDec*10 + (s.charAt(i)-'0');
            }
        }
        double sum = (aftDec + befDec);
        System.out.printf("%.6f",sum);
    }
}