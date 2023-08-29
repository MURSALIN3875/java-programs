import java.util.*;
class palindrome
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
     String s1;
     int f=0;
      System.out.println("Enter string:-");
      s1=sc.next();
      StringBuffer s2=new StringBuffer(s1);
      s2.reverse();
    for(int i=0;i<s1.length();i++)
   {
      if(s1.charAt(i)!=s2.charAt(i))
       {
          f=1;
          break;
       }
   }
 if(f==1)
  System.out.println("String is not palindrome");
else
System.out.println("String is palindrome");
  }

}