class demo
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
  String s1[20];
  int f=0;
s1=sc.next();
 for(int i=0;i<s1.length();i++)
 {
   if(s1[i]=='A'||s1[i]=='a'||s1[i]=='E'||s1[i]=='e'||s1[i]=='I'||s1[i]=='i'||s1[i]=='O'||s1[i]=='o'||s1[i]=='U'||s1[i]=='u')
     {
        f=1;
        break;
     }
 }
if(f==1)
System.out.println("Vowels is present");
else
System.out.println("Vowels is Not present");
}
}