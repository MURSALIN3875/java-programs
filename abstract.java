import java.util.*;
abstract class A
{
 abstract void add(int x,int y);
}
class B extends A
{
 void add(int x,int  y)
{
  int m=x+y;
  System.out.println("Addition :-"+m);
}
public static void main(String a[])
{
B ob=new B();
ob.add(20,40);
 
}
}