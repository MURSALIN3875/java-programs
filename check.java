class Check
{
 void evenodd(int n)
{
  if(n%2==0)
System.out.println("number is even:"+n);
else
System.out.println("number is odd:"+n);
}
void posneg(int n)
{
 if(n<0)
 System.out.println("number is negative:"+n);
else
 System.out.println("number is positive:"+n);
}
void prime(int n)
{
 int  f=0;
for(int i=2;i<n;i++)
{

if(n%i==0)
{
  f=1;
 break;
}
}
if(f==0)
System.out.println("no is prime:"+n);
else
 System.out.println("no is not prime:"+n);
}
public static void main(String arg[])
{
  Check ob=new Check();
  ob.evenodd(7);
  ob.posneg(-2);
  ob.prime(11);
}
}




