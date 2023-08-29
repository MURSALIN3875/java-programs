import java.util.*;
class prime
{
 public static void main(String arg[])
  {
    int i,f=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter No:-");
    int n=sc.nextInt();
   for(i=2;i<n;i++)
    {
       if(n%i==0)
       {
         f=1;
         break;
       }
   }
 if(f==1)
 System.out.println("No is not prime");
else
System.out.println("No is prime");
  }

}