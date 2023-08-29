import java.util.*;
class Emp2
{
 int eno,cnt,sal;
 String name,dname;
Emp2()
{
eno=1;
name="rehan";
dname="computer";
sal=20000;
}
Emp2(int eno,String name,String dname,int sal)
{
cnt++;
System.out.println("object="+cnt);
this.eno=eno;
this.sal=sal;
this.name=name;
this.dname=dname;
}
void display()
{
  System.out.println("eno:-"+this.eno);
  System.out.println("ename:-"+name);
  System.out.println("dname:-"+dname);
  System.out.println("sal:-"+sal);
}
public static void main(String a[])
{
 int i;
  Scanner sc=new Scanner(System.in);
   System.out.print("Enter limit:-");
  int n=sc.nextInt();
  System.out.print("Enter eno:-");
  int eno=sc.nextInt();
  System.out.print("Enter ename:-");
  String ename=sc.next();
 System.out.print("Enter dname:-");
  String dname=sc.next();
 System.out.print("Enter sal:-");
  int sal=sc.nextInt();
 Emp2 ob[]=new Emp2[n];
  for(i=0;i<n;i++)
{
  ob[i]=new Emp2(eno,ename,dname,sal);
}
ob[i].display();
}
}