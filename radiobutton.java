import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
 CheckboxGroup cg,cg1;
 Checkbox c1,c2,c3,c4,c5;
 Label l1,l2,l3,l4,l5;
 TextField t1;
 TextArea ta1,ta2;
Button b1,b2,b3;
Demo()
{
 setVisible(true);
 setSize(500,500);
 setLayout(new FlowLayout());
 setBackground(Color.yellow);

l1=new Label("Enter Name:-");
l2=new Label("Enter Address:-");
l3=new Label("Select Gender:-");
l4=new Label("Select Class:-");
l5=new Label("Student Details:-");

cg=new CheckboxGroup();
c1=new Checkbox("Male",cg,true);
c2=new Checkbox("Female",cg,false);

cg1=new CheckboxGroup();
c3=new Checkbox("FyBcs",cg1,true);
c4=new Checkbox("SyBcs",cg1,false);
c5=new Checkbox("TyBcs",cg1,false);

t1=new TextField(10);
ta1=new TextArea();
ta2=new TextArea();

b1=new Button("Submit");
b2=new Button("Clear");
b3=new Button("Exit");

add(l1);add(t1);add(l2);add(ta1);add(l3);add(c1);add(c2);add(l4);add(c3);add(c4);add(c5);add(l5);add(ta2);add(b1);add(b2);
add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
 String s1="",s2="",s3="",s4="";
  if(ae.getSource()==b1)
  {
    s1=t1.getText();
    s2=ta1.getText();
    if(c1.getState())
       s3="male";
    if(c2.getState())
       s3="Female";
     if(c3.getState())
       s4="FyBcs";
     if(c4.getState())
       s4="SyBcs";
     if(c5.getState())
       s4="TyBcs";
 ta2.setText("Name:-"+s1+"\nAdd:-"+s2+"\nGender:-"+s3+"\nClass:-"+s4);  
}
if(ae.getSource()==b2)
{
  t1.setText("");
  ta1.setText("");
  ta2.setText("");
}
if(ae.getSource()==b3)
{
  dispose();
}
}
public static void main(String arg[])
{
  new Demo();
}
}












