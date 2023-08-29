// accept string and display vowels
class String1
{
public static void main(String a[])
{
 int i;
  String s1="mursalin";
 for(i=0;i<s1.length();i++)
{
   if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
    System.out.print(s1.charAt(i));
}
}
}