import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,bequal,bclear;
Panel p1;
char ch;
double n1=0,n2=0,result=0;

Demo()
{
 setVisible(true);
 setSize(500,500);
 setBackground(Color.white);
 setLayout(new FlowLayout());
 setTitle("Calculator");

b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
b0=new Button("0");
bdot=new Button(".");
badd=new Button("+");
bsub=new Button("-");
bmul=new Button("*");
bdiv=new Button("/");
bequal=new Button("=");
bclear=new Button("X");

b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b0.setBackground(Color.white);
badd.setBackground(Color.white);
bsub.setBackground(Color.white);
bmul.setBackground(Color.white);
bdiv.setBackground(Color.white);
bdot.setBackground(Color.white);
bequal.setBackground(Color.white);
bclear.setBackground(Color.white);


p1=new Panel();
p1.setLayout(new GridLayout(4,4,30,30));
p1.setPreferredSize(new Dimension(350,350));
p1.setBackground(Color.white);
p1.setForeground(Color.black);
p1.setFont(new Font("SERIF",Font.PLAIN,30));
p1.add(b1);p1.add(b2);p1.add(b3);p1.add(badd);
p1.add(b4);p1.add(b5);p1.add(b6);p1.add(bsub);
p1.add(b7);p1.add(b8);p1.add(b9);p1.add(bmul);
p1.add(b0);p1.add(bdot);p1.add(bequal);p1.add(bdiv);
t1=new TextField();
t1.setPreferredSize(new Dimension(300,75));
t1.setFont(new Font("Arial",Font.PLAIN,30));

add(t1);
add(bclear);
add(p1);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
bdot.addActionListener(this);
badd.addActionListener(this);
bsub.addActionListener(this);
bmul.addActionListener(this);
bdiv.addActionListener(this);
bequal.addActionListener(this);
bclear.addActionListener(this);


}
public void actionPerformed(ActionEvent ae)
{
int n=0;

  if(ae.getSource()==b1)
   {  
      n=1;
  t1.setText(t1.getText()+n);
   }

 if(ae.getSource()==b2)
   {
      n=2;
     t1.setText(t1.getText()+n);
   }
if(ae.getSource()==b3)
   {
     n=3;
     t1.setText(t1.getText()+n);
   }
if(ae.getSource()==b4)
   {
      n=4;
     t1.setText(t1.getText()+n);
   }
if(ae.getSource()==b5)
   {
      n=5;
     t1.setText(t1.getText()+n);
   }
if(ae.getSource()==b6)
   {
      n=6;
     t1.setText(t1.getText()+n);
   }
if(ae.getSource()==b7)
   {
     n=7;
     t1.setText(t1.getText()+n);
   }
if(ae.getSource()==b8)
   {
      n=8;
     t1.setText(t1.getText()+n);
   }
if(ae.getSource()==b9)
   {
     n=9;
     t1.setText(t1.getText()+n);
   }
if(ae.getSource()==b0)
   {
      n=0;
     t1.setText(t1.getText()+n);
   }
if(ae.getSource()==badd)
   {
 n1=Double.parseDouble(t1.getText());
    ch='+';
     t1.setText("");
     
   }
if(ae.getSource()==bsub)
   {
    ch='-';
    n1=Double.parseDouble(t1.getText());
     t1.setText("");
   }
 if(ae.getSource()==bmul)
   {
 ch='*';
   n1=Double.parseDouble(t1.getText());
     t1.setText("");
   }
 if(ae.getSource()==bdot)
   {
     n1=Double.parseDouble(t1.getText());
       t1.setText(t1.getText()+".");
   }
 if(ae.getSource()==bdiv)
   {
 ch='/';
        n1=Double.parseDouble(t1.getText());
     t1.setText("");
   }
  if(ae.getSource()==bequal)
   {
      n2=Integer.parseInt(t1.getText());
     if(ch=='+')
       {
        result=n1+n2;
         t1.setText(String.valueOf(result));
         n1=result;
       }
   if(ch=='-')
       {
        result=n1-n2;
         t1.setText(String.valueOf(result));
       n1=result;  
     }
 if(ch=='*')
       {
        result=n1*n2;
         t1.setText(String.valueOf(result));
        n1=result;
       }

   if(ch=='/')
       {
        result=n1/n2;
          t1.setText(String.valueOf(result));
        n1=result;
       }
    
   }
if(ae.getSource()==bclear)
   {
     t1.setText("");
    
   }
}
public static void main(String arg[])
{
 new Demo();
}
}















