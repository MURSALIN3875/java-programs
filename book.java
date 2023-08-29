class Book
{
  int bno;
 String bname;
 int price;
String author;
int quantity;
int t,p;
void accept(int no,String name,int price1,String author1,int quantity1)
{
 bno=no;
 bname=name;
 price=price1;
 author=author1;
 quantity=quantity1;
}
void calculate()
{
t=quantity;
p=price*t;
}
void display()
{
System.out.println("book no is:"+bno);
System.out.println("book name is:"+bname);
System.out.println("book price is:"+price);
System.out.println("book authour is:"+author);
System.out.println("book quantity is:"+quantity);
System.out.println("total amount of book is:"+p);
}
public static void main(String a[])
{
Book ob=new Book();
ob.accept(11,"english",140,"mursalin",6);
ob.calculate();
ob.display();
}
}





























