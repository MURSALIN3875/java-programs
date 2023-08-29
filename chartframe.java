import java.awt.*;
import java.awt.event.*;
class Chart extends Frame implements ActionListener
{
Label l1,l2;
TextField t1;
List lst;
Button b1,b2;
  Chart()
{
 setVisible(true);
 setSize(500,500);
 setTitle("Chart");
 setLayout(new FlowLayout());
 setBackground(Color.cyan);
 
l1=new Label("Enetr No:-");
l2=new Label("Chart:-");
t1=new TextField(10);
lst=new List(10);
b1=new Button("Ok");
b2=new Button("Exit");

add(l1);add(t1);add(l2);add(lst);add(b1);add(b2);
b1.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==b1)
  {
  int n=Integer.parseInt(t1.getText());
   
   for(int i=1;i<=10;i++)
   {
  
     lst.add(""+i*n);
    }
 }
}
public static void main(String a[])
{
 Chart ob=new Chart();
}
}








