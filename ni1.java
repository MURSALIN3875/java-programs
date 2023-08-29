import java.util.*;
class Demo
{
   public static void main(String arg[])
   {
     int f=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Eneter String:-");
     String S1=sc.next();
    for(int i=0;i<S1.length();i++)
     {
        if(S1.charAt(i)=='A'||S1.charAt(i)=='a'||S1.charAt(i)=='E'||S1.charAt(i)=='e'||S1.charAt(i)=='I'||S1.charAt(i)=='i'||S1.charAt(i)=='O'||S1.charAt(i)=='o'||S1.charAt(i)=='U'||S1.charAt(i)=='u')
      {
         System.out.print(S1.charAt(i));
          f=1;
        
       }
 
      }
if(f==1)
System.out.println("Vowels Are present");
else
System.out.println("Vowels are not present");
    }
}