import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
Panel p1;
TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
Demo()
{
 setVisible(true);
 setSize(500,500);
 setTitle("Tictoe");
 setLayout(new FlowLayout());

t1=new TextField();
b1=new Button();
b2=new Button();
b3=new Button();
b4=new Button();
b5=new Button();
b6=new Button();
b7=new Button();
b8=new Button();
b9=new Button();
p1=new Panel();
p1.setLayout(new GridLayout(3,3));
p1.setPreferredSize(new Dimension(480,400));
p1.setBackground(Color.white);
p1.setForeground(Color.yellow);
t1.setBackground(Color.black);
t1.setPreferredSize(new Dimension(480,50));
t1.setText("Tictoe");
t1.setForeground(Color.green);
t1.setFont(new Font("cursive",Font.PLAIN,30));
b1.setText("O");


b1.setBackground(Color.black);
b2.setBackground(Color.black);
b3.setBackground(Color.black);
b4.setBackground(Color.black);
b5.setBackground(Color.black);
b6.setBackground(Color.black);
b7.setBackground(Color.black);
b8.setBackground(Color.black);
b9.setBackground(Color.black);
p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);p1.add(b5);p1.add(b6);p1.add(b7);p1.add(b8);p1.add(b9);

add(t1);
add(p1);
}
public void actionPerformed(ActionEvent ae)
{
  }
public static void main(String arg[])
{
 new Demo();
}
}