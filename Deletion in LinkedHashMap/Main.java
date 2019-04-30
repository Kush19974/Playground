import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
        String name;
        int mark;
        System.out.print("Enter the number of values to be inserted in map:");
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
        for(int i = 0;i<n;i++)
        {
            name = br.readLine();
            mark = Integer.parseInt(br.readLine());
            lhm.put(name,mark);
        }
        System.out.println(lhm);
        System.out.print("Enter the index to be removed:");
        String m = br.readLine();
        System.out.println(m);
        lhm.remove(m);
        System.out.println(lhm);
        System.out.println("Size of map is : "+lhm.size());
    }
}
