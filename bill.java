import java.util.*;
class Bill
{
 int nreading,oreading,bill,tax,unit,total;

void accept()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter new reading :-");
 int nr=sc.nextInt();
 System.out.println("enter old reading :-");
 int or=sc.nextInt();
nreading=nr;
oreading=or;
}
void calculate()
{
  unit=nreading-oreading;
 if(unit<100)
 total=unit*5;
if(unit>=100&&unit<200)
 total=unit*10;
else
total=unit*15;

bill=total+140;
}
void display()
{
System.out.println("new reading :-"+nreading);
System.out.println("old reading :-"+oreading);
System.out.println("units :-"+unit);
System.out.println("total bill :-"+bill);
}
public static void main(String a[])
{
  Bill ob=new Bill();
  ob.accept();
  ob.calculate();
  ob.display();
}
}































