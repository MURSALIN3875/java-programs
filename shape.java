// create abstract class shape and method area()
// and calculate area of triangle and rectangle
import java.util.*;
abstract class Shape
{
Scanner sc=new Scanner (System.in);
abstract void area();
}
class Rectangle extends Shape
{
 void area()
{
System.out.print("enter length:-");
double l=sc.nextDouble();
System.out.print("enter breadth:-");
double b=sc.nextDouble();
 double a=l*b;
System.out.print("Area of rectangle:-"+a);
}
}
class Triangle extends Shape
{
 void area()
{
System.out.print("enter base:-");
double l=sc.nextDouble();
System.out.print("enter height:-");
double b=sc.nextDouble();
 double a=0.5*l*b;
System.out.println("Area of triangle:-"+a);
}
public static void main(String b[])
{
Triangle ob=new Triangle();
Rectangle ob1=new Rectangle();
ob.area();
ob1.area();
}
}


