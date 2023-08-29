// accpet string and display alternate character from a string
import java.util.*;
class String2
{
  public static void main(String a[])
{
 int i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter string :-");
   String s1=sc.nextLine();
  for(i=0;i<s1.length();i=i+2)
     {
       System.out.print(s1.charAt(i));
    }
}
}