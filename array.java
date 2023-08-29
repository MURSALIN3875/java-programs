// accept emp info eno,name,sal and display using array
import java.util.*;
class Array
{
  int eno,n;
  String ename;
  int sal;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter eno :-");
eno=sc.nextInt();
System.out.println("Enter ename :-");
ename=sc.next();
System.out.println("Enter salary :-");
sal=sc.nextInt();
}
void display()
{
System.out.println("emp no ="+eno);
System.out.println("emp name ="+ename);
System.out.println("emp salary ="+sal);
}
public static void main(String a[])
{
 int n=0,ch,i,flag=0;
 Scanner sc=new Scanner(System.in);
 Array ob[]=new Array[20];              // declare arrray
do
{
  System.out.println("1:accept \n2:display \n3:search");
  System.out.println("Enter choice :-");
   ch=sc.nextInt();
switch(ch)
{
  case 1:System.out.println(" Enter limit:-");
             n=sc.nextInt();
             for(i=0;i<n;i++)
             {
                ob[i]=new Array();
                ob[i].accept();
             }
             break;
   case 2:for(i=0;i<n;i++)
             {
                ob[i].display();
             }
             break;
 case 3:System.out.println("Enter eno to search :-");
            int num=sc.nextInt();
            for(i=0;i<n;i++)
            {
              if(ob[i].eno==num)
              {
                 flag=1;
                 break;             
              }
            }
            if(flag==1)
             {
              System.out.println("emp no ="+ob[i].eno);
              System.out.println("emp name ="+ob[i].ename);
              System.out.println("emp salary ="+ob[i].sal);
             }
           else
                System.out.println(" not found");
          break;
}
}while(ch<4);


}
}








