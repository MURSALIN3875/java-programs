import java.util.*;
class Student
{
 int rno,per;
 String s1;
Student()
{
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter rno:-");
  rno=sc.nextInt();
  System.out.print("Enter name :-");
  s1=sc.next();
  System.out.print("Enter percentage :-");
  per=sc.nextInt();
}
static void sort(Student ob[],int n)
{
  int pass,i;
  Student t;
  for(pass=1;pass<n;pass++)
{
  for(i=0;i<n-pass;i++)
  {
    if(ob[i].per>ob[i+1].per)
   {
     t=ob[i];
     ob[i]=ob[i+1];
     ob[i+1]=t;
   }
  }
}
for(i=0;i<n;i++)
 {
   System.out.println(ob[i].rno+"\t"+ob[i].s1+"\t"+ob[i].per);
}
}
public static void main(String a[])
{
 int n,i;
 Scanner sc=new Scanner(System.in);
  System.out.print("Enter limit:-");
   n=sc.nextInt();
Student ob[]=new Student[n];
  for(i=0;i<n;i++)
{
  ob[i]=new Student();
}
 sort(ob,n);
}
}













