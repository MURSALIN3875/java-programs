import javax.swing.*;
import java.awt.*;
class Notepad extends JFrame
{
  MenuBar mb;
  Menu file,edit,view;
  MenuItem ne,open,save,saveAs,font,color;
Notepad()
{
  setVisible(true);
  setSize(1000,1000);
  setTitle("Notepad");

  mb=new MenuBar();
  setMenuBar(mb);
  
 file=new Menu("File");
edit=new Menu("Edit");
view=new Menu("View");

ne=new MenuItem("New");
open=new MenuItem("open");
save=new MenuItem("save");
saveAs=new MenuItem("saveAs");
font=new MenuItem("font");
color=new MenuItem("color");

mb.add(file);mb.add(edit);mb.add(view);

file.add(ne);file.add(open);file.add(save);file.add(saveAs);edit.add(font);edit.add(color);
}
 public static void main(String a[])
{
  new Notepad();
}
}