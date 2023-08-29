 // Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg). Create an array of n player objects .Calculate the batting average for each player using staticmethod avg(). Define a static sort method which sorts the array on the basis of average. Displaythe player details in sorted order

import java.util.*;
class CricketPlayer
{
  static String name;
  static int innings,notout,totalruns;
 static double avg;

CricketPlayer(String name,int innings,int notout,int totalruns)
{
 this.name=name;
 this.innings=innings;
 this.notout=notout;
 this.totalruns=totalruns;
}

static void avg()
{
  avg=totalruns/innings;
 System.out.println("Average is:-"+avg);
}

public static void main(String arg[])
{
  int n,i,innings,notout,totalruns;
  String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit:-");
n=sc.nextInt();
 CricketPlayer ob[]=new CricketPlayer[n];
 for(i=0;i<n;i++)
  {
    System.out.println("Enter name:-");
    name=sc.next();
    System.out.println("Enter innings:-");
    innings=sc.nextInt();
    System.out.println("Enter notout:-");
    notout=sc.nextInt();
    System.out.println("Enter total runs:-");
    totalruns=sc.nextInt();

    ob[i]=new CricketPlayer(name,innings,notout,totalruns);
  }
for(i=0;i<n;i++)
{
  ob[i].avg();
}
}

}