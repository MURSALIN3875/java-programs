import java.util.*;
class Append
{
public static void main(String a[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter string :-");
 String s1=sc.nextLine();
StringBuffer s2=new StringBuffer(s1);
 s2.append("sayyad");

System.out.println("reverse:-"+s2);
}
}