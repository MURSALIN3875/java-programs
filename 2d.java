// accept 2*2 matrix and display transport of atrix
import java.util.*;
class Twod
{
public static void main(String b[])
{
 int i,j;
Scanner sc=new Scanner(System.in);
int a[][]=new int[2][2];
System.out.print("Enter matrix ");
for(i=0;i<2;i++)
 for(j=0;j<2;j++)
a[i][j]=sc.nextInt();
System.out.println("transpose matrix :-");
for(i=0;i<2;i++)
{
 for(j=0;j<2;j++)
{
  System.out.print(a[j][i]+"\t");
}
System.out.println();
}

}
}