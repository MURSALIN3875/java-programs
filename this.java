class This
{
int a=10;
void show()
{
 int a=20;
System.out.println("value :"+a);
System.out.println("value 2:"+this.a);
this.a=30;
a=40;
System.out.println("value 3:"+a);
System.out.println("value 4:"+this.a);
}
public static void main(String a[])
{
This ob=new This();
ob.show();
}
}