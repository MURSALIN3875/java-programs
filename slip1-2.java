// Define an abstract class Staff with protected members id and name. Define a parameterizedconstructor. Define onesubclass OfficeStaff with member department. Create n objects ofOfficeStaff and display all details.
import java.util.*;
abstract class Staff
{
   protected int id;
   protected String name;
}
class OfficeStaff extends Staff
{
public int id;
public String name;
String dept;
   OfficeStaff(int id,String name,String dept)
  {
    this.id=id;
    this.name=name;
    this.dept=dept;
 }
void display()
{
  System.out.println("employe id:-"+id);
  System.out.println("employe id:-"+name);
  System.out.println("employe id:-"+dept);
 }
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);

 int id,i,n;
String name,dept;
System.out.println("Enter limit:-");
n=sc.nextInt();
 OfficeStaff ob[]=new OfficeStaff[n];
for(i=0;i<n;i++)
{
  System.out.println("Enter emoloye id:-");
  id=sc.nextInt();
System.out.println("Enter emoloye name:-");
  name=sc.next();
System.out.println("Enter emoloye department:-");
  dept=sc.next();
 ob[i]=new OfficeStaff(id,name,dept); 
}
for(i=0;i<n;i++)
{
   ob[i].display();
}
}
}