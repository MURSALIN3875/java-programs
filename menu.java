import java.awt.*;
import javax.swing.*;

class notepad extends Frame {
    MenuBar mb;
    Menu file, edit, help, rehan;
    MenuItem open, neFile, save, saveAs, FontSize, Color, Contact, bagwan;

    notepad() {
        setVisible(true);
        setSize(500, 500);
        setLocation(500, 10);

        mb = new MenuBar();
        setMenuBar(mb);

        file = new Menu("File");
        edit = new Menu("edit");
        help = new Menu("help");
        rehan = new Menu("Rehan");
        open = new MenuItem("Open");
        neFile = new MenuItem("New File");
        save = new MenuItem("save");
        saveAs = new MenuItem("save As");
        FontSize = new MenuItem("FontSize");
        Color = new MenuItem("Color");
        Contact = new MenuItem("Contact");
        bagwan = new MenuItem("bagwan");

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        file.add(open);
        file.add(neFile);
        file.add(save);
        file.add(saveAs);
        edit.add(FontSize);
        edit.add(Color);
        help.add(Contact);

        file.add(rehan);
        rehan.add(bagwan);

    }

    public static void main(String[] args) {
        new notepad();
    }

}