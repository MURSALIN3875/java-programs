import java.awt.*;
import java.awt.event.*;
class Even extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1,b2;

  Even()
 {
   setVisible(true);
   setSize(500,500);
   setLayout(new FlowLayout());
   setBackground(Color.cyan);
   setTitle("check EvenOdd");

  l1=new Label("Enter No:-");
  l2=new Label("Number is:-");
  t1=new TextField(10);
  t2=new TextField(10);
  b1=new Button("Check");
  b2=new Button("Exit");

 add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
 
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
 {
    if(ae.getSource()==b1)
    {
      int a=Integer.parseInt(t1.getText());
      if(a%2==0)
      {
       t2.setText("Even");
      }
      else
      {
      t2.setText("odd");
      }
   }
 }
 public static void main(String a[])
{
 Even ob=new Even();
}

}