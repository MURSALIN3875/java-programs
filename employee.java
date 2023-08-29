import java.util.*;
class Employee
{
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter eno :-");
int eno=sc.nextInt();
System.out.println("enter ename :-");
String ename=sc.next();
System.out.println("enter sal :-");
int sal=sc.nextInt();
System.out.println("employee eno is:-"+eno);
System.out.println("employee ename is:-"+ename);
System.out.println("employee sal is:-"+sal);
}

public static void main(String arg[])
{
Employee ob=new Employee();
ob.accept();

}
}