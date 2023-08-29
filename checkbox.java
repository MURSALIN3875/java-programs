// accept check boxes and display selected in textarea
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
Checkbox ch1,ch2,ch3;
Button b1,b2;
TextArea ta1;
  Demo()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    
    ch1=new Checkbox("java");
    ch2=new Checkbox("php");
    ch3=new Checkbox("c Language");
    
    b1=new Button("Submit");
    b2=new Button("Exit");

    ta1=new TextArea();
add(ch1);add(ch2);add(ch3);add(ta1);add(b1);add(b2);

b1.addActionListener(this);
b2.addActionListener(this);
  }
public void actionPerformed(ActionEvent ae)
{
   
  if(ae.getSource()==b1)
   {
      if(ch1.getState()==true)
         ta1.setText("java");
      if(ch2.getState()==true)
         ta1.setText(ta1.getText()+" php");
       if(ch3.getState()==true)
         ta1.setText(ta1.getText()+" C language");   
   }
 if(ae.getSource()==b2)
{
   dispose();
}
}
public static void main(String arg[])
{
   new Demo();
}
}