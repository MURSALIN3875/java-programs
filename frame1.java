import java.awt.*;
import java.awt.event.*;
class Framedemo extends Frame implements ActionListener
{
  Label l1,l2,l3;
  TextField t1,t2,t3;
   Button b1,b2;
  Framedemo()
  {
    setVisible(true); 
    setSize(500,500);
    setTitle("Addition");
    setBackground(Color.yellow);
    setLayout(new FlowLayout());
    l1=new Label("Enter no:-");
    l2=new Label("Enetr no:-");
    l3=new Label("Result:-");
    t1=new TextField(10);
    t2=new TextField(10);
    t3=new TextField(10);
    b1=new Button("Add");
    b2=new Button("Exit");
    add(l1);add(l2);add(l3);add(t1);add(t2);add(t3);add(b1);add(b2);
  }
  public void ActionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
     {
       int c=t1+t2;
       t3.add(c);
   }    
  }
  public static void main(String a[])
 {
   Framedemo ob=new Framedemo(); 
  }
}








