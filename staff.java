import java.util.*;
abstract class Staff
{
 String name,add;
 Staff(String name,String add)
{
 this.name=name;
 this.add=add;
}
}
class Fulltime extends Staff
{
 String dept;
 int sal;
 Fulltime(String dept,int sal,String name,String add)
 {
   super(name,add);
   this.dept=dept;
   this.sal=sal;
 }
 void display()
{
 System.out.println("name:-"+name);
 System.out.println("address:-"+add);
 System.out.println("department:-"+dept);
 System.out.println("salary:-"+sal);
}
}
class Parttime extends Staff
{
 int hours,rate;
 Parttime(int hours,int rate,String name,String add)
 {
   super(name,add);
   this.hours=hours;
 }
 void display()
{
 System.out.println("name:-"+name);
 System.out.println("address:-"+add);
 System.out.println("working hours:-"+hours);
 System.out.println("salary:-"+(hours*rate));
}
}
class Md
{
 public static void main(String b[])
{
 int i,n,ch;
  Scanner sc=new Scanner(System.in);
  Fulltime ob[]=new Fulltime[20];
  Parttime ob1[]=new Parttime[20];
  do
    {
       System.out.println("1:fulltime \n 2:Parttime");
       System.out.println("Enter choice :-");
       ch=sc.nextInt();
     switch(ch)
       {
         case 1:System.out.println("Enter limit :-");
                    n=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                       System.out.println("Enter name:-");
                       String name=sc.next();
                       System.out.println("Enter add:-");
                       String add=sc.next();
                       System.out.println("Enter dept:-");
                       String dept=sc.next();
                        System.out.println("Enetr salary:-");
                        int sal=sc.nextInt();
                     ob[i]=new Fulltime( dept,sal, name, add);
                    }
                    for(i=0;i<n;i++)
                     {
                       ob[i].display();
                    }
                    break;
          case 2:System.out.println("Enter limit :-");
                    n=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                       System.out.println("Enter name:-");
                       String name=sc.next();
                       System.out.println("Enter add:-");
                       String add=sc.next();
                       System.out.println("Enter hours:-");
                       int hours=sc.nextInt();
                       System.out.println("Enter rate:-");
                        int rate=sc.nextInt();
                     ob1[i]=new Parttime(hours,rate,name,add);
                    }
                    for(i=0;i<n;i++)
                     {
                       ob1[i].display();
                    }
                    break;
       }
    }while(ch<3);
}
}














