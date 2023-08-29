class Overloading
{
 void add(int a,int b)
{
int c=a+b;
System.out.println("addition 1 :"+c);
}
void add(int x,float y)
{
float z=x+y;
System.out.println("addition 2 :"+z);
}
void add(float p,float q)
{
float s=p+q;
System.out.println("addition 3 :"+s);
}
public static void main(String a[])
{
Overloading ob=new Overloading();
ob.add(10,20);
ob.add(15,25f);
ob.add(20f,40f);
}
}