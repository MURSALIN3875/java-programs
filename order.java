import java.util.*;
abstract class Order
{
  int id;
  String des;
Scanner sc=new Scanner(System.in);
abstract void accept();
abstract void display();
}
class Purchase extends Order
{
 String cname;
 public void accept()
{
 System.out.println("Enter id:-");
 id=sc.nextInt();
 System.out.println("Enter description:-");
 des=sc.next();
 System.out.println("Enter customer name:-");
 cname=sc.next();
}
public void display()
{
 System.out.println("id:-"+id);
 System.out.println("descrition:-"+des);
 System.out.println("descrition:-"+cname);

}
}
class Sales extends Order
{
 String vname;
 public void accept()
{
 System.out.println("Enter id:-");
 id=sc.nextInt();
 System.out.println("Enter description:-");
 des=sc.next();
 System.out.println("Enter vendor name:-");
 vname=sc.next();
}
public void display()
{
 System.out.println("id:-"+id);
 System.out.println("descrition:-"+des);
 System.out.println("descrition:-"+vname);
}
}
class Md
{
 public static void main(String b[])
{
 int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit:-");
n=sc.nextInt();
Purchase ob[]=new Purchase[20];
Sales ob1[]=new Sales[20];
for(i=0;i<n;i++)
{
  ob[i]=new Purchase();
  ob[i].accept();
}
for(i=0;i<n;i++)
{
  ob[i].display();
}
for(i=0;i<n;i++)
{
  ob1[i]=new Sales();
  ob1[i].accept();
}
for(i=0;i<n;i++)
{
  ob1[i].display();
}
}
}







