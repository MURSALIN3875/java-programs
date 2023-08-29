import java.util.*;
class Py
{
 int eno,sal;
 String ename;
 void accept()
{
 Scanner sc=new Scanner(System.in);
 System.out.println(" Enter eno :");
 eno=sc.nextInt();
 System.out.print(" enter ename :-");
 ename=sc.next();
 System.out.println(" Enetr salary :-");
 sal=sc.nextInt();
}
void display()
{
System.out.println("employee no is:-"+eno);
System.out.println("employee name is:-"+ename);
System.out.println("employee salary is:-"+sal);
}
public static void main(String a[])
{
 int n,i,ch;
 Scanner sc=new Scanner(System.in);
 Py ob[]=new Py[n];
do
    {
      System.out.println("1:Accept \n 2:display");
      System.out.println("Enetr choice:-");
      ch=sc.nextInt();
   switch(ch)
   {
     case 1:System.out.print(" Enter limit :-");
                 n=sc.nextInt();
                for(i=0;i<n;i++)
                {
                  ob[i]=new Py();
                  ob[i].accept();
                }
                break;
     case 2:for(i=0;i<n;i++)
                {
                  ob[i].display();
                }
                break;
                
   }
    }while(ch<3);
}
}











