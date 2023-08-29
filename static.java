import java.util.*;
class Stat
{
static int a1,b1;
static void add()                                      // using static functon
{
 Scanner sc=new Scanner(System.in);
  System.out.println("enter No:-");
  int a=sc.nextInt();
 System.out.println("enter No:-");
  int b=sc.nextInt();
a1=a;
b1=b;
int c=a+b;
System.out.println("Addition :-"+c);
}
static void substract()
{

int d=a1-b1;
System.out.println("substraction :-"+d);
}
static void multi()
{
 
int e=a1*b1;
System.out.println("multiplication :-"+e);
}
public static void main(String a[])
{
 Stat ob=new Stat();
 Stat. add();   // calling function by classname
 ob.substract();  // calling function by object name
  multi();  //calling function with only function name
}

}