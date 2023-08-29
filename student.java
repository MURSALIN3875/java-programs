
class Student
{
  int sno;
 String sname;
 int m1;
 int m2;
 int m3;
 int t;
 double p;
void accept(int no,String name,int s1,int s2,int s3)
{
  sno=no;
  sname=name;
  m1=s1;
  m2=s2;
 m3=s3;
}
void display()
{
 System.out.println("student no is:"+sno);
 System.out.println("student name is:"+sname);
 System.out.println("student subject1 mark is:"+m1);
 System.out.println("student subject2 mark is:"+m2);
 System.out.println("student subject2 mark is:"+m3);
 System.out.println("student total mark is:"+t);
 System.out.println("student percentage is:"+p);
}
void calculate()
{
 int t1=m1+m2+m3;
 double p1=t1/3;
  t=t1;
  p=p1;
}
public static void main(String arg[])
{
 Student ob=new Student();
 ob.accept(1,"Mursalin",76,81,88);
 ob.calculate();
 ob.display();
}
}












