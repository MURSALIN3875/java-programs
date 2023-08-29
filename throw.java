import java.util.*;
class AgeInvalid extends Exception
{
  public String toString()
{
  return"age invalid for voting...";
}
}
class A
{
  public static void main(String b[])
{
 try
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter age:-");
   int n=sc.nextInt();
  if(n<0)
  throw new AgeInvalid();
 if(n>=18)
 System.out.println("voter....");
else
 System.out.println("not elligible for voter");
}catch(Exception e)
{
 System.out.println(e);A
}
}
}