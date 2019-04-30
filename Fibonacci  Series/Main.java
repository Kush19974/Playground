import java.io.*;
class Fibonacci extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter the limit for Fibonacci: ");
               int n = Integer.parseInt(br.readLine());
               System.out.println(n);
               if(n <= 0)
               {
                  throw new Exception("Exception");
               }
               else
               {
               System.out.print("The Fibonacci series is :");
               while(n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
               }
          }
          catch (Exception e)
          {
               System.out.println("Exception occurred");
          }
     }
}
class Main
{
     public static void main(String[] args) 
     {
              Fibonacci fib = new Fibonacci();
               fib.start();
      }
}