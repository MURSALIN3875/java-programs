// Write a program to accept ‘n’ name of cities from the user and sort them in ascending order.
import java.util.*;
class demo
{
  public static void main(String arg[])
  {
    int n,i,j,k;
String t;
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit:-");
     n=sc.nextInt();
      String s1[]=new String[n];
  System.out.println("Enter city name:-");
  for(i=0;i<n;i++)
  {
    s1[i]=sc.next();
 }  
for(i=0;i<n;i++)
  {
     for(j=i+1;j<n;j++)
     {
       k=s1[i].compareTo(s1[j]);
       if(k>0)
         {
            t=s1[i];
            s1[i]=s1[j];
            s1[j]=t;
        }
      }
 } 
System.out.println("Sorted citeis:-");
 for(i=0;i<n;i++)
  {
    System.out.print(" "+s1[i]);
 }   
}
}