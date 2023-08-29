// accept cricket player info and calculate avg then sort by avg and display
import java.util.*;
class Cricket
{
  int innings,notout,runs;
  String name;
  double avg;
 void accept()
{
 Scanner sc=new Scanner(System.in);
 System.out.print("enter name:-");
 name=sc.next();
 System.out.print("enter no of innings:-");
 innings=sc.nextInt();
 System.out.print("enter total runs:-");
 runs=sc.nextInt();
}
void avg(Cricket ob[],int n)
{
 int i;
  for(i=0;i<n;i++)
    {
      ob[i].avg=ob[i].runs/ob[i].innings;
    }
}
void sort(Cricket ob[],int n)
{
 int pass,i;
 Cricket t;
      for(pass=1;pass<n;pass++)
        {
          for(i=0;i<n-pass;i++)
            {

              if(ob[i].avg>ob[i+1].avg)
               {
                 t=ob[i];
                 ob[i]=ob[i+1];
                 ob[i+1]=t;
               }
            } 
        }

}
 void display(Cricket ob[],int n)
{
 int i;
  for(i=0;i<n;i++)
{
     System.out.println("name:-"+ob[i].name);
     System.out.println("innings :-"+ob[i].innings);
     System.out.println("total run:-"+ob[i].runs);
     System.out.println("average:-"+ob[i].avg);
}
}
public static void main(String a[])
{
  int n,i;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter limit :-");
  n=sc.nextInt();
 Cricket ob[]=new Cricket[n];
 for(i=0;i<n;i++)
  {
     ob[i]=new Cricket();
     ob[i].accept();   
  }
ob[0].avg(ob,n);
ob[0].sort(ob,n);
ob[0].display(ob,n);   
  
}

}
