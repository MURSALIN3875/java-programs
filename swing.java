import javax.swing.*;
import java.awt.*;
class Swing extends JFrame
{
 JLabel l1,l2,l3;
 JTextField t1,t2,t3;
 JButton b1,b2;
 Swing()
{
  setVisible(true);
  setSize(500,500);
  setLayout(null);
 
l1=new JLabel("Enter no 1:-");
l1.setBounds(100,20,100,100);
l2=new JLabel("Enter no 2:-");
l2.setBounds(100,60,100,100);
l3=new JLabel("Addition:-");
l3.setBounds(100,100,100,100);
t1=new JTextField(10);
t1.setBounds(200,50,100,30);
t2=new JTextField(10);
t2.setBounds(200,100,100,30);
t3=new JTextField(10);
t3.setBounds(200,150,100,30);
b1=new JButton("Add");
b2=new JButton("Exit");

add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);
}
public static void main(String a[])
{
 new Swing();
}
}