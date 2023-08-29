// accept doctor info and display in ascending order by name
import java .util.*;
class Doctor
{
  int dno;
  String dname,qualification,s1;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enetr dno:-");
dno=sc.nextInt();
System.out.print("Enetr dname:-");
dname=sc.next();
System.out.print("Enetr qualification:-");
qualification=sc.next();
}
 void sort(Doctor ob[],int n)
{
 int pass,i;
 Doctor t;
      for(pass=1;pass<n;pass++)
        {
          for(i=0;i<n-pass;i++)
            {

              if(ob[i].dname.compareTo(ob[i+1].dname)>0)
               {
                 t=ob[i];
                 ob[i]=ob[i+1];
                 ob[i+1]=t;
               }
            } 
        }

}
void disp(Doctor ob[],int n)
{
 int i;
for(i=0;i<n;i++)
  {
    System.out.println("dno:-"+ob[i].dno);
     System.out.println("dname:-"+ob[i].dname);
     System.out.println("qualification:-"+ob[i].qualification);
  }
}
public static void main(String a[])
{
  int i,n;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enetr limit :-");
  n=sc.nextInt();
  Doctor ob[]=new Doctor[n];
 for(i=0;i<n;i++)
  {
     ob[i]=new Doctor();
     ob[i].accept();
  }
ob[0].sort(ob,n);
ob[0].disp(ob,n);
}
}

