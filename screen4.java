import java.awt.*;
import java.awt.List;
import java.util.*;
import java.awt.event.*;

class demo extends Frame implements ActionListener {

    Label l1, l2, l3, l4, l5, l6;
    TextField t1, t2, t3, t4, t5;
    Button b1, b2, b3, b4, b5, b6, b7;
    List lst;

    demo() {
        setTitle("Stone Paper Sccisor");
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setLocation(400, 10);

        l1 = new Label("Stone , Paper , Scissor");
        l1.setFont(new Font("Raleway", Font.BOLD, 40));
        l1.setBounds(200, 60, 800, 40);
        add(l1);

        l2 = new Label("You:");
        l2.setBounds(100, 100, 100, 100);
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l2);

        t1 = new TextField();
        t1.setBounds(200, 135, 100, 30);
        t1.setEnabled(false);
        t1.setFont(new Font("Raleway", Font.BOLD, 15));
        t1.setForeground(Color.RED);
        add(t1);

        l3 = new Label("Computer:");
        l3.setBounds(330, 100, 100, 100);
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l3);

        t2 = new TextField();
        t2.setBounds(500, 135, 100, 30);
        t2.setEnabled(false);
        t2.setFont(new Font("Raleway", Font.BOLD, 15));
        add(t2);

        b1 = new Button("Stone");
        b1.setBounds(200, 200, 70, 40);
        add(b1);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Raleway", Font.BOLD, 15));
        b2 = new Button("Paper");
        b2.setBounds(330, 200, 70, 40);
        add(b2);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Raleway", Font.BOLD, 15));

        b3 = new Button("Scissor");
        b3.setBounds(460, 200, 70, 40);
        add(b3);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Raleway", Font.BOLD, 15));
        b4 = new Button("Submit");
        b4.setBounds(330, 260, 80, 43);
        add(b4);
        b4.setBackground(Color.GREEN);
        b4.setForeground(Color.black);
        b4.setFont(new Font("Raleway", Font.BOLD, 15));
        l4 = new Label("Result:");
        l4.setBounds(100, 350, 100, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l4);

        t3 = new TextField();
        t3.setBounds(200, 350, 560, 60);
        t3.setEnabled(false);
        t3.setFont(new Font("Raleway", Font.BOLD, 15));
        add(t3);

        b5 = new Button("Exit");
        b5.setBounds(670, 460, 60, 40);
        add(b5);
        b5.setBackground(Color.red);
        b5.setForeground(Color.black);
        b5.setFont(new Font("Raleway", Font.BOLD, 15));

        l5 = new Label("My Points:");
        l5.setBounds(50, 450, 100, 30);
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l5);

        t4 = new TextField();
        t4.setBounds(170, 450, 80, 40);
        t4.setEnabled(false);
        t4.setFont(new Font("Raleway", Font.BOLD, 20));
        t4.setText("0");
        add(t4);

        l6 = new Label("Computer Points:");
        l6.setBounds(270, 450, 200, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l6);

        t5 = new TextField();
        t5.setBounds(470, 450, 80, 40);
        t5.setEnabled(false);
        t5.setFont(new Font("Raleway", Font.BOLD, 20));
        t5.setText("0");
        add(t5);
        lst = new List();
        lst.setBounds(240, 550, 500, 150);
        lst.setVisible(false);
        add(lst);

        b6 = new Button("History");
        b6.setBounds(100, 550, 80, 40);
        add(b6);
        b7 = new Button("Hide");
        b7.setBounds(100, 630, 80, 40);
        add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String a[] = { "Stone", "Paper", "Scissor" };
        Random ran = new Random();

        if (ae.getSource() == b1) {

            t1.setText("Stone");
            t2.setText("");

        }
        if (ae.getSource() == b2) {
            t1.setText("Paper");
            t2.setText("");
        }
        if (ae.getSource() == b3) {
            t1.setText("Scissor");
            t2.setText("");
        }
        if (ae.getSource() == b6) {
            lst.setVisible(true);

        }
        if (ae.getSource() == b7) {
            lst.setVisible(false);

        }

        if (ae.getSource() == b4) {
            String s1 = t1.getText();
            int computer = ran.nextInt(3);
            if (s1.equalsIgnoreCase("Stone") && computer == 0) {
                t3.setText("Draw You Both Choose Same ");
                t2.setText(a[0]);
                lst.add("Draw You Both Choose Same ( Stone )");

            }
            if (s1.equalsIgnoreCase("Stone") && computer == 1) {
                t3.setText("Computer Win!! Paper beats Stone: Paper wraps or covers the stone.");
                t2.setForeground(Color.green);
                t2.setText(a[1]);
                lst.add("Computer Win!! Paper beats Stone: Paper wraps or covers the stone");
                int c = Integer.parseInt(t5.getText());
                ++c;
                t5.setText("" + c);

            }
            if (s1.equalsIgnoreCase("Stone") && computer == 2) {
                t3.setText("You Win!! Stone beats Scissors: Stone crushes or breaks scissors. ");
                t2.setText(a[2]);
                lst.add("You Win!! Stone beats Scissors: Stone crushes or breaks scissors");
                int y = Integer.parseInt(t4.getText());
                ++y;
                t4.setText("" + y);

            }
            if (s1.equalsIgnoreCase("Paper") && computer == 0) {
                t3.setText("You  Win!!  Paper beats Stone: Paper wraps or covers the stone.");
                t2.setText(a[0]);
                lst.add("You  Win!!  Paper beats Stone: Paper wraps or covers the stone.");
                int y = Integer.parseInt(t4.getText());
                ++y;
                t4.setText("" + y);

            }
            if (s1.equalsIgnoreCase("Paper") && computer == 1) {
                t3.setText("Draw You Both Choose Same ");
                lst.add("Draw You Both Choose Same ( Paper )");
                t2.setText(a[1]);

            }
            if (s1.equalsIgnoreCase("Paper") && computer == 2) {
                t3.setText("Computer Win!! Scissors beats Paper: Scissors cut through paper.");
                t2.setForeground(Color.green);
                t2.setText(a[2]);
                lst.add("\"Computer Win!! Scissors beats Paper: Scissors cut through paper");
                int c = Integer.parseInt(t5.getText());
                ++c;
                t5.setText("" + c);

            }
            if (s1.equalsIgnoreCase("Scissor") && computer == 0) {
                t3.setText("Computer Win!! Stone beats Scissors: Stone crushes or breaks scissors.");
                t2.setForeground(Color.green);
                lst.add("Computer Win!! Stone beats Scissors: Stone crushes or breaks scissors.");
                t2.setText(a[0]);
                int c = Integer.parseInt(t5.getText());
                ++c;
                t5.setText("" + c);

            }
            if (s1.equalsIgnoreCase("Scissor") && computer == 1) {
                t3.setText("You win!! Scissors beats Paper: Scissors cut through paper ");
                t2.setText(a[1]);
                lst.add("You win!! Scissors beats Paper: Scissors cut through paper");
                int y = Integer.parseInt(t4.getText());
                ++y;
                t4.setText("" + y);

            }
            if (s1.equalsIgnoreCase("Scissor") && computer == 2) {
                t3.setText("Draw You Both Choose Same ");
                lst.add("Draw You Both Choose Same");
                t2.setText(a[2]);

            }

        }
        if (ae.getSource() == b5) {
            dispose();
        }

    }

    public static void main(String arg[]) {
        new demo();
    }

}