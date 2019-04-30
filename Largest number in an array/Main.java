import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arry[] = new int[n];
      for(int index = 0; index < n; index++)
      {
        arry[index] = sc.nextInt();
      }
      int max = 0;
      // cheack max element for first 2 element
      if (arry[0] > arry[1])
      {
        max = arry[0];
      }
      else
      {
        max = arry[1];
      }
      // for cheacking max no from element 2 to (n-1)th 
      // compare max of first 2 element to other elements in an array
      for (int index = 2; index < n; index++)
      {
        if (max < arry[index])
        {
          max = arry[index];
        }     
      }
      System.out.println(max);
    }
}