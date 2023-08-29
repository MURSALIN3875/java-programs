import java.util.*;
class Inval extends Exception
{
  public String toString()
  {
    return"patient is covid positive";
  }
}
class A
{
   public static void main(String a[])
  {
    try
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter patient name:-");
      String pname=sc.next();
      System.out.println("Enter patient age:-");
      int age=sc.nextInt();
      System.out.println("Enter patient oxy level:-");
      int oxy=sc.nextInt();
      System.out.println("Enter patient HRCT:-");
      int hrct=sc.nextInt();
      if(oxy<95&&hrct>10)
        throw new Inval();
      System.out.println("patient name="+pname);
      System.out.println("patient name="+age);
      System.out.println("patient name="+oxy);
      System.out.println("patient name="+hrct);
   }catch(Exception e)
  {
    System.out.println(e);
  } 

  }
}  














