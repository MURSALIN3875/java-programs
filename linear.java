import java.util.*;
class linear
{
 public static void main(String arg[])
{
  Scanner sc=new Scanner(System.in);
   int a[]=new int[5];
   int i,f=0;
   System.out.println("Enter array elemnts:-");
   for(i=0;i<5;i++)
   {
    a[i]=sc.nextInt();
   }
System.out.println("Enetr number to search:-");
int num=sc.nextInt();
for(i=0;i<5;i++)
   {
     if(a[i]==num)
      {
        f=1;
        break;
       }
   }
if(f==1)
System.out.println("Number found:-"+num);
else
System.out.println("Number not found:-"+num);

System.out.println("Array:-");
 for(i=0;i<5;i++)
   {
    System.out.print(a[i]+"\t");
   }











}
}