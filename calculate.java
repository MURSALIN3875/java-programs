import java.util.*;
abstract class Shape1
{
 abstract void calc_area();
 abstract void calc_volume();
 Scanner sc=new Scanner(System.in);
}
class Sphere extends Shape1
{
 void calc_area()
{
 System.out.println("Enter radius :-");
 double r=sc.nextDouble();
 double a=4*3.14*r*r;
 System.out.println("area of sphere :-"+a);
}
void calc_volume()
{
 System.out.println("Enter radius :-");
 double r=sc.nextDouble();
 double a=4/3*3.14*r*r*r;
 System.out.println("volume of sphere :-"+a);
}
}
class Cone extends Shape1
{
 void calc_area()
{
 System.out.println("Enter radius :-");
 double r=sc.nextDouble();
 System.out.println("Enter height :-");
 double h=sc.nextDouble();
 double a=3.14*r*(h*h+r*r);
 System.out.println("area of cone :-"+a);
}
void calc_volume()
{
 System.out.println("Enter radius :-");
 double r=sc.nextDouble();
 System.out.println("Enter height :-");
 double h=sc.nextDouble();
 double a=3.14*r*r*h/3;
 System.out.println("volume of cone :-"+a);
}
public static void main(String a[])
{
   Sphere ob1=new Sphere();
   Cone ob=new Cone();
   ob.calc_area();
   ob.calc_volume();
   ob1.calc_area();
   ob1.calc_volume();
}
}