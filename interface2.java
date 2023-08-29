interface I1
{
 void area();
}
class Rectangle implements I1
{
  double l,b;
 Rectangle(double l,double h)
 {
   this.l=l;
   this.b=h;
 }
 public void area()
{
 double a=l*b;
 System.out.println("area of rectangle:-"+a);
}
}
class Square extends Rectangle
{
  double s;
  Square(double l,double b)
{
  super(l,b);
  this.s=l;
}
public void area()
{
 double a=s*s;
 System.out.println("area of square:-"+a);
 super.area();
}
}
class Circle implements I1
{
  double r;
  Circle(double r)
 {
  this.r=r;
 }
public void area()
{
  double a=3.14*r*r;
  System.out.println("area of circle:-"+a);
}
}
class Md
{
 public static void main(String b[])
{
  Square ob=new Square(5,6);
  Circle ob1=new Circle(3.4);
  ob.area();
  ob1.area();
}
}











