import java.util.*;
class fibo
{
 public static void main(String arg[])
 {
   Scanner sc=new Scanner(System.in);
   int i,n,a=0,b=1,c=1;
   System.out.println("Enter no:-");
   n=sc.nextInt();
   for(i=0;i<n;i++)
    {
      
     System.out.print(a+",");
     a=b;
     b=c;
     c=a+b;
   }
 }
}