import java.util.*;
class Split
{
 public static void main(String a[])
{
  Scanner sc=new Scanner(System.in); 
  System.out.println("Enter full name :-");
  String s1=sc.nextLine();
  String s2[]=s1.split(" ");
  System.out.println("name :-"+s2[2]+"."+s2[0].charAt(0)+"."+s2[1].charAt(0));
}
}