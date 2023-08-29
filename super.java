import java.util.*;
class A
{
  void add(int p,int q)
{
  int m=p+q;
  System.out.println("Addition 1:-"+m);
}
}
class B extends A
{
 void add(int p,int q)
{
  int m=p+q;
  System.out.println("Addition 2:-"+m);
 super.add(p,q);
}
public static void main(String a[])
{
 B ob=new B();
 ob.add(15,25);
}
}