import java.util.*;
class Min
{
  public static void main(String b[])
{ 
 int i,n,p,min,s=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter limit :-");
 n=sc.nextInt();
 int a[]=new int[n];
 System.out.print(" enter array numbers");
 for(i=0;i<n;i++)
  {
  a[i]=sc.nextInt();
  }
p=a[0];
for(i=0;i<n;i++)
  {
    if(a[i]<p)
    p=a[i]; 
    s=i;
  }
System.out.println("minimum no is :-"+p);
min=a[0];
for(i=0;i<n;i++)
  {
    if(a[i]!=p&&a[i]<min&&a[i]>p)
    min=a[i]; 
  }
System.out.println("second minimum no is :-"+min);
}
}