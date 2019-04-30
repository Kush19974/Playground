import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        String month = br.readLine();
        String[] arr = month.split(",");
        for(int i = 0;i<arr.length;i++)
        {
            lhs.add(arr[i]);
        }
        System.out.println(lhs);
        System.out.print("Enter the value to be deleted: ");
        String n = br.readLine();
        System.out.println(n);
        lhs.remove(n);
        System.out.println(lhs);
        System.out.print("Enter the value to be added: ");
        String m = br.readLine();
        System.out.println(m);
        lhs.add(m);
        System.out.println(lhs);
    }
}