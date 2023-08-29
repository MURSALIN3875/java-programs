// acccept 2 matrix and display thier addition
import java.util.*;
class Twodadd
{
public static void main(String d[])
{
 int i,j;
 Scanner sc=new Scanner(System.in);
 int a[][]=new int[2][2];
 int b[][]=new int[2][2];
 int c[][]=new int[2][2];
System.out.print("Enter first matrix ");
 for(i=0;i<2;i++)
  for(j=0;j<2;j++)
    a[i][j]=sc.nextInt();

System.out.print("Enter second matrix ");
 for(i=0;i<2;i++)
  for(j=0;j<2;j++)
    b[i][j]=sc.nextInt();

 for(i=0;i<2;i++)
  for(j=0;j<2;j++)
    c[i][j]=a[i][j]+b[i][j];

 for(i=0;i<2;i++)
{
  for(j=0;j<2;j++)
  {
    System.out.print(c[i][j]+"\t");
}
 System.out.println();
}
}
}