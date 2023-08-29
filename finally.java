class A
{
 public static void main(String h[])
{
 int a=0,b=0,c=0,d=0,n=5;
 try
{
   n=5;
  a=n+5;
  b=n-2;
  c=n/1;
  d=n*8;
}catch(Exception e)
{
System.out.println("Error:-"+e);
}
finally
{
System.out.println("Addition:-"+a);
 System.out.println("substraction:-"+b);
 System.out.println("division:-"+c);
System.out.println("multiplication:-"+d);
}
}
}





