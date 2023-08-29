class Area
{
 void circle(double r)
{
 double a=3.14*r*r;
 System.out.println("area of circle:-"+a);
}
void rectangle(int l,int b)
{
 int a=l*b;
System.out.println("area of rectangle:-"+a);
}
void square(int s)
{
 int a=s*s;
System.out.println("area of square:-"+a);
}
public static void main(String arg[])
{
 Area ob=new Area();
ob.circle(3.4);
ob.rectangle(5,6);
ob.square(5);
}
}