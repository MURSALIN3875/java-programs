import java.util.*;
class Invalid extends Exception
{
  public String toString()
  {
    return"invalid pan";
  }
}
class Invalid1 extends Exception
{
  public String toString()
  {
    return"invalid No";
  }
}
class Demo
{
 public static void main(String b[])
{
  try
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter mobile no");
  int mno=sc.nextInt();
  String s=""+mno;
  if(s.length()!=10)
    throw new Invalid1();
 System.out.println("Mobile no:-"+mno);


System.out.println("Enter pan no:-");
  String pan=sc.next();
   if(pan.length()!=10)
    throw new Invalid();
 for(int i=0;i<=4;i++)
{
   if(!Character.isUpperCase(pan.charAt(i)))
      throw  new Invalid();   
}
for(int i=5;i<=8;i++)
{
   if(!Character.isDigit(pan.charAt(i)))
      throw  new Invalid();   
}
 if(!Character.isUpperCase(pan.charAt(9)))
      throw  new Invalid();   
 System.out.println("pan no:-"+pan);
}catch(Exception e)
{
  System.out.println("erroe:-"+e);
}
}
}
















