import java.util.*;
class demo
{
 public static void main(String arg[])
{
int a,b;
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of a:-");
   a=sc.nextInt();
  System.out.println("Enter value of b:-");
   b=sc.nextInt();
 b=a+b;
 a=b-a;
 b=b-a;

 System.out.println("Value of a:-"+a);
System.out.println("Value of b:-"+b);
 
} 
}