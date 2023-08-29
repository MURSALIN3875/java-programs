interface Operation
{
 final double pi=3.14;
 void area(double r,double h);
 void volume(double r,double h);
}
class Cylinder implements Operation
{
 public void area(double r,double h)
{
  double a=2*pi*r*h+2*pi*r*r;
 System.out.println("area of cylinder:-"+a);
}
 public void volume(double r,double h)
{
  double v=pi*r*h*h;
 System.out.println("volume of cylinder:-"+v);
}
}
class Md
{
  public static void main(String b[])
{
  Cylinder ob=new Cylinder();
  ob.area(3.4,2.8);
  ob.volume(4.2,6.3);
}
}












