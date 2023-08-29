import java.util.*;
class Parameterized
{
  Parameterized(int eno,String s1,int sal)
{
 System.out.println("employee Eno:-"+eno);
 System.out.println("employee Ename:-"+s1);
 System.out.println("employee salary:-'"+sal);
}
public static void main(String a[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter eno:-");
 int eno=sc.nextInt();
System.out.println("Enter ename:-");
 String s1=sc.next();
System.out.println("Enter salary:-");
 int sal=sc.nextInt();
 Parameterized ob=new Parameterized(eno,s1,sal);
}
}