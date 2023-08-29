class A
{
 public static void main(String b[])
{
 try
{
  int a[]=new int[5];
  a[1]=10;
 a[6]=20;
  System.out.println("value 1:-"+a[1]);
  System.out.println("value 2:-"+a[6]);
}catch(Exception e)
 {
   System.out.println("mistake:-"+e);
 }
}
}