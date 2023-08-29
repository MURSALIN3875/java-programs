import java.util.*;
abstract class Staff
{
protected int id;
protected String name;
 Staff(int id,String name)
{
 this.id=id;
 this.name=name;
}
}
class Office extends Staff
{
  String dept;
 Office(String dept,int id,String name)
{
 super(id,name);
  this.dept=dept;
}
void display()
{
  System.out.println("id:-"+id);
  System.out.println("name:-"+name);
  System.out.println("department:-"+dept);
}
}
class Md
{
  public static void main(String b[])
{
  int i,n;
 Scanner sc=new Scanner(System.in);
 Office ob[]=new Office[20];
 System.out.println("Eneter limit:-");
 n=sc.nextInt();8:35 PM 7/13/2023
 for(i=0;i<n;i++)
{
   System.out.println("Enter id:-");
   int id=sc.nextInt();
   System.out.println("Enter name:-");
   String name=sc.next();
   System.out.println("Enter department:-");
   String dept=sc.next();
   ob[i]=new Office(dept,id,name);
}
for(i=0;i<n;i++)
{
 ob[i].display();
}
}
}







