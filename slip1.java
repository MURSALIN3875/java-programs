// Write a Program to print all Prime numbers in an array of ‘n’ elements.(use command line arguments)
import java.util.*;
class demo
{
   public static void main(String arg[])
 {
  int n,i,f=0,j;
   Scanner sc=new Scanner(System.in);
   n=Integer.parseInt(arg[0]);
   int a[]=new int[n];
  for(i=2;i<n;i++)
  {
     f=0;
     for(j=2;j<i;j++)
     {
        if(i%j==0)
         {
           f=1;
         }
     }
if(f==0)
System.out.print("\t"+i);
  }
}
}