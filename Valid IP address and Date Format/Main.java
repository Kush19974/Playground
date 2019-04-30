import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class Main{
	
	public static void main(String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
        System.out.println(str + " is valid? "+Main.isValidIP(str));
        String str1 = sc.nextLine();
        System.out.println("Is " + str1+ " a valid date format? " + validateDateFormat(str1));
    }
 
	public static boolean isValidIP(String ipAddr){
         
        Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Matcher mtch = ptn.matcher(ipAddr);
        return mtch.find();
	}
         public static boolean validateDateFormat(String userName){
            
            Pattern dateFrmtPtrn = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
            Matcher mtch1 = dateFrmtPtrn.matcher(userName);
            return mtch1.find();
        }
    }