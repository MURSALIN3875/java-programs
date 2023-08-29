interface I1
{
 void add(int a,int b);
 void square(int s);
}
interface I2
{
void leap(int y);
}
class A implements I1,I2
{
  public void add(int a,int b)
 {
  int c=a+b;
  System.out.println("Addition:-"+c);
 }
 public void square(int s)
{
  int a=s*s;
 System.out.println("square:-"+a);
}
public void leap(int y)
{
  if(y%4==0)
 System.out.println("leap year");
 else
 System.out.println("not leap year");
}
}
class Md
{
 public static void main(String b[])
{
 A ob=new A();
 ob.add(10,20);
 ob.square(5);
 ob.leap(2024);
}
}












