import java.util.*;
class Demo 
{
   int eno,sal;
   String s1;
  void accept()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter eno:-");
   eno=sc.nextInt();
   System.out.println("Enter name:-");
   s1=sc.next();
  System.out.println("Enter salary:-");
   sal=sc.nextInt();   
 }
void display()
{
 System.out.println("employee no:-"+eno);
 System.out.println("employee name:-"+s1);
 System.out.println("employee salary:-"+sal);
}
public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
  int i,n=0,ch;
  Demo ob[]=new Demo[20];
 do
  {
    System.out.println("\n1:accept \n2:display");
    System.out.println("Enter choice:-");
     ch=sc.nextInt();
 switch(ch)
    {
      case 1:System.out.println("Enter Limit:-");
                  n=sc.nextInt();
                  for(i=0;i<n;i++)
                   {
                      ob[i]=new Demo();
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








