class Empthis
{
 int eno,sal;
 String ename;
 void accept(int eno,String ename,int sal)
{
this.eno=eno;
this.ename=ename;
this.sal=sal;
}
void display()
{
System.out.println("emp no is :"+eno);
System.out.println("emp name is :"+ename);
System.out.println("emp sal is :"+sal);
}
public static void main(String a[])
{
Empthis ob=new Empthis();
ob.accept(101,"Mursalin",50000);
ob.display();
}

}