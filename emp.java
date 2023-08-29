class Emp
{
  int eno;
  String ename;
  int sal;
 void accept(int no,String name,int salary)
{
 eno=no;
ename=name;
sal=salary;
}
void display()
{
 System.out.println("employe no is:"+eno);
 System.out.println("employe name is:"+ename);
 System.out.println("employe salary is:"+sal);
}
public static void main(String arg[])
{
  Emp ob=new Emp();
 ob.accept(101,"Mursalin",50000);
 ob.display();
}
}