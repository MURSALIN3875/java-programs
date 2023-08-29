// accept emai add and check valid or not
import java.util.*;
class Email
{
  
  public static void main(String a[])
{
  int i,f=0,k=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enetr email add:-");
  String s1=sc.nextLine();
if(s1.charAt(0)>='0'&&s1.charAt(0)<='9')
   {
     k=1;
   }
  for(i=0;i<s1.length();i++)
{
 if(s1.charAt(i)=='@'&&k==0)
{
  f=1;
  break;
}
} 

if(f==1)
 System.out.println("email is  valid");
else
  System.out.println("email is not valid");

}
}