import java.awt.*;
import java.awt.event.*;
class Add extends Frame implements ActionListener
{
 Label l1,l2,l3;
 TextField t1,t2,t3;
 Button b1,b2;
  Add()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    setBackground(Color.green);
    setTitle("Addition");
 
   l1=new Label("Enter No:-");
   l2=new Label("Enter No:-");
   l3=new Label("Addition:-");
   t1=new TextField(10);
   t2=new TextField(10);
   t3=new TextField(10);
   b1=new Button("Add");
   b2=new Button("Exit");

  add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);
  
  b1.addActionListener(this);
  b2.addActionListener(this);
  }
 public void actionPerformed(ActionEvent ae)
{
   if(ae.getSource()==b1)
    {
       int a=Integer.parseInt(t1.getText());
       int b=Integer.parseInt(t2.getText());
       int c=a+b;
       t3.setText(""+c);  
   }
  if(ae.getSource()==b2)
   {
    dispose();
  } 
}

public static void main(String a[])
{
  Add ob=new Add();
}
}



