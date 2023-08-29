import java.util.*;
class A
{
A()
{
System.out.println("i am default constructer of base class a");
}
}
class B extends A
{
B()
{
System.out.println("i am default constructer of derived class b");
}
public static void main(String a[])
{
B ob=new B();
}
}