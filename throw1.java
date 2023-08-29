import java.util.*;
class CheckNum extends Exception
{
  public String toString()
{
  return"Number is small";
}
}
class CheckNum1 extends Exception
{
  public String toString()
{
  return"Number is Greater";
}
}
class A
{
  public static void main(String b[])
  {
 int c=0;
    try
  {
   Scanner sc=new Scanner (System.in);
    int n;
   System.out.println("Enter number:-");
   n=sc.nextInt();
   c=n;
   if(n<5)
   throw new CheckNum();
    if(n>10)
   throw new CheckNum1();
   for(int i=0;i<=n;i++)
       c=n*i;
 System.out.println("armstrong:-"+c);
  }catch(Exception e)
{
 System.out.println(e);
}
  }
}












