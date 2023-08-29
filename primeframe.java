import java.awt.*;
import java.awt.event.*;
class Prime extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1,b2;
  Prime()
 { 
  setVisible(true);
  setSize(500,500);
  setLayout(new FlowLayout());
  setTitle("chech Prime Number");
  setBackground(Color.yellow);

 l1=new Label("Enter No:-");
 l2=new Label("Result");
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
 int flag=0;
   int n=Integer.parseInt(t1.getText());
   for(int i=2;i<n;i++)
      {
        if(i%n==0)
         {
         flag=1;
         }
    }
  if(flag==1)
   t2.setText("Not Prime");
 else
   t2.setText("No is Prime");
 }
if(ae.getSource()==b2)
 { 
   dispose();
 }
}
public static void main(String a[])
{
 Prime ob=new Prime();
}
} 







