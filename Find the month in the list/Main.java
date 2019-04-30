import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> ll = new LinkedList<String>();
        String month = br.readLine();
        String[] arr = month.split(",");
        for(int i = 0;i<arr.length;i++)
        {
            ll.add(arr[i]);
        }
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
                String m1 = br.readLine();
      //System.out.println("Enter the month to find in the given list" +m1 = br.readLine());

        System.out.println("Does LinkedList contains "+m1+"?");
        System.out.println(ll.contains(m1));
    }
}
