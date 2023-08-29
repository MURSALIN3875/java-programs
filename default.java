import java.util.*;
class Construct
{
 int eno,sal;
 String s1;
  Construct()
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter emp no:-");
 int eno=sc.nextInt();
 System.out.println("Enter ename :-");
 String s1=sc.next();
 System.out.println("Enter salary :-");
 int sal=sc.nextInt();
 this.eno=eno;
 this.s1=s1;
 this.sal=sal;
}
void display()
{
System.out.println("emp no:-"+eno);
System.out.println("emp no:-"+s1);
System.out.println("emp no:-"+sal);
}
public static void main(String a[])
{
  Construct ob=new Construct();
  ob.display();
  
}
}









