// accept string from user and display uppercase to lower and lower to uppercase
import java.util.*;
class Upper
{
public static void main(String a[])
{
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter string :-");
String s1=sc.nextLine();
StringBuffer s2=new StringBuffer(s1);
if(s2.isUpperCase())
  s2=s2.toLowerCase();
else
    s2=s2.toUpperCase();

System.out.println(" string :-"+s2);
}
}