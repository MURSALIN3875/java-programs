import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class ox extends Frame implements MouseListener {
    TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, result;
    Label l1, l2, gameName, l3;
    int n = 1, random, flag = 0;
    String s1, O, O1, O2, O3, O4, O5, O6, O7, O8, X, X1, X2, X3, X4, X5, X6, X7, X8;
    Button exit;

    ox() {

        setVisible(true);
        setSize(700, 600);
        setLocation(500, 10);
        setLayout(null);
        setTitle("Tic-Tac-Toe");
        gameName = new Label(" Tic-Tac-Toe");
        gameName.setBounds(200, 40, 300, 40);
        gameName.setFont(new Font("SansSerif,", Font.PLAIN, 50));
        gameName.setBackground(Color.LIGHT_GRAY);
        add(gameName);

        l1 = new Label("O turn");
        l1.setBounds(100, 120, 100, 30);
        l1.setFont(new Font("serif", Font.BOLD, 30));
        add(l1);

        l2 = new Label("X turn");
        l2.setBounds(480, 120, 100, 30);
        l2.setFont(new Font("serif", Font.BOLD, 30));
        add(l2);

        t1 = new TextField();
        t1.setBounds(150, 200, 100, 60);
        t1.setFont(new Font("serif", Font.BOLD, 50));
        add(t1);

        t2 = new TextField();
        t2.setBounds(270, 200, 100, 60);
        t2.setFont(new Font("serif", Font.BOLD, 50));
        add(t2);

        t3 = new TextField();
        t3.setBounds(400, 200, 100, 60);
        t3.setFont(new Font("serif", Font.BOLD, 50));
        add(t3);

        t4 = new TextField();
        t4.setBounds(150, 270, 100, 60);
        t4.setFont(new Font("serif", Font.BOLD, 50));
        add(t4);

        t5 = new TextField();
        t5.setBounds(270, 270, 100, 60);
        t5.setFont(new Font("serif", Font.BOLD, 50));
        add(t5);

        t6 = new TextField();
        t6.setBounds(400, 270, 100, 60);
        t6.setFont(new Font("serif", Font.BOLD, 50));
        add(t6);

        t7 = new TextField();
        t7.setBounds(150, 340, 100, 60);
        t7.setFont(new Font("serif", Font.BOLD, 50));
        add(t7);

        t8 = new TextField();
        t8.setBounds(270, 340, 100, 60);
        t8.setFont(new Font("serif", Font.BOLD, 50));
        add(t8);

        t9 = new TextField();
        t9.setBounds(400, 340, 100, 60);
        t9.setFont(new Font("serif", Font.BOLD, 50));
        add(t9);

        result = new TextField();
        result.setBounds(150, 440, 300, 60);
        result.setFont(new Font("serif", Font.BOLD, 30));
        add(result);

        l3 = new Label("Result :");
        l3.setBounds(30, 450, 100, 30);
        l3.setFont(new Font("serif", Font.BOLD, 35));
        add(l3);

        exit = new Button("Exit");
        exit.setBounds(500, 440, 66, 60);
        exit.setBackground(Color.RED);
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("serif", Font.BOLD, 20));
        add(exit);

        t1.addMouseListener(this);
        t2.addMouseListener(this);
        t3.addMouseListener(this);
        t4.addMouseListener(this);
        t5.addMouseListener(this);
        t6.addMouseListener(this);
        t7.addMouseListener(this);
        t8.addMouseListener(this);
        t9.addMouseListener(this);
        exit.addMouseListener(this);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");

        t1.setFocusable(false);
        t2.setFocusable(false);
        t3.setFocusable(false);
        t4.setFocusable(false);
        t5.setFocusable(false);
        t6.setFocusable(false);
        t7.setFocusable(false);
        t8.setFocusable(false);
        t9.setFocusable(false);

        t1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        result.setEnabled(false);
        setBackground(Color.LIGHT_GRAY);

        l3.setBackground(Color.WHITE);
        l3.setForeground(Color.BLACK);

        Random ran = new Random();

        random = ran.nextInt(2);
        if (random == 0) {
            l1.setVisible(true);
            l2.setVisible(false);
        } else {
            l1.setVisible(false);
            l2.setVisible(true);
        }

    }

    public void mouseClicked(MouseEvent fe) {
        if (random == 0) {

            if (n % 2 != 0) {

                if (fe.getSource() == t1) {
                    t1.setText("O");
                    t1.setEnabled(false);

                } else if (fe.getSource() == t2) {

                    t2.setText("O");
                    t2.setEnabled(false);
                } else if (fe.getSource() == t3) {
                    t3.setText("O");
                    t3.setEnabled(false);
                } else if (fe.getSource() == t4) {
                    t4.setText("O");
                    t4.setEnabled(false);
                } else if (fe.getSource() == t5) {
                    t5.setText("O");
                    t5.setEnabled(false);
                } else if (fe.getSource() == t6) {
                    t6.setText("O");
                    t6.setEnabled(false);
                } else if (fe.getSource() == t7) {
                    t7.setText("O");
                    t7.setEnabled(false);
                } else if (fe.getSource() == t8) {
                    t8.setText("O");
                    t8.setEnabled(false);
                } else if (fe.getSource() == t9) {
                    t9.setText("O");
                    t9.setEnabled(false);
                }
                l1.setVisible(false);
                l2.setVisible(true);

                ++n;

            }

            else {

                if (fe.getSource() == t1) {

                    t1.setText("X");

                    t1.setEnabled(false);

                } else if (fe.getSource() == t2) {
                    t2.setText("X");
                    t2.setEnabled(false);
                } else if (fe.getSource() == t3) {
                    t3.setText("X");
                    t3.setEnabled(false);
                } else if (fe.getSource() == t4) {
                    t4.setText("X");
                    t4.setEnabled(false);
                } else if (fe.getSource() == t5) {
                    t5.setText("X");
                    t5.setEnabled(false);
                } else if (fe.getSource() == t6) {
                    t6.setText("X");
                    t6.setEnabled(false);
                } else if (fe.getSource() == t7) {
                    t7.setText("X");
                    t7.setEnabled(false);
                } else if (fe.getSource() == t8) {
                    t8.setText("X");
                    t8.setEnabled(false);
                } else if (fe.getSource() == t9) {
                    t9.setText("X");
                    t9.setEnabled(false);
                }
                l2.setVisible(false);
                l1.setVisible(true);
                ++n;
            }

            O = t1.getText();
            O1 = t2.getText();
            O2 = t3.getText();
            O3 = t4.getText();
            O4 = t5.getText();
            O5 = t6.getText();
            O6 = t7.getText();
            O7 = t8.getText();
            O8 = t9.getText();

            X = t1.getText();
            X1 = t2.getText();
            X2 = t3.getText();
            X3 = t4.getText();
            X4 = t5.getText();
            X5 = t6.getText();
            X6 = t7.getText();
            X7 = t8.getText();
            X8 = t9.getText();

            if ((O.equals("O") && O1.equals("O") && O2.equals("O"))
                    || (O.equals("O") && O3.equals("O") && O6.equals("O"))
                    || (O1.equals("O") && O4.equals("O") && O7.equals("O"))
                    || (O2.equals("O") && O5.equals("O") && O8.equals("O"))
                    || (O3.equals("O") && O4.equals("O") && O5.equals("O"))
                    || (O6.equals("O") && O7.equals("O") && O8.equals("O"))
                    || (O.equals("O") && O4.equals("O") && O8.equals("O"))
                    || (O2.equals("O") && O4.equals("O") && O6.equals("O"))) {
                l2.setVisible(false);

                if (t1.getText().equals("O") && t2.getText().equals("O") && t3.getText().equals("O")) {
                    t1.setEnabled(true);
                    t2.setEnabled(true);
                    t3.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t2.setBackground(Color.GREEN);
                    t3.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t2.removeMouseListener(this);
                    t3.removeMouseListener(this);
                }
                if (t4.getText().equals("O") && t5.getText().equals("O") && t6.getText().equals("O")) {
                    t4.setEnabled(true);
                    t5.setEnabled(true);
                    t6.setEnabled(true);
                    t4.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t6.setBackground(Color.GREEN);
                    t4.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t6.removeMouseListener(this);
                }
                if (t7.getText().equals("O") && t8.getText().equals("O") && t9.getText().equals("O")) {
                    t7.setEnabled(true);
                    t8.setEnabled(true);
                    t9.setEnabled(true);
                    t7.setBackground(Color.GREEN);
                    t8.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t7.removeMouseListener(this);
                    t8.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t1.getText().equals("O") && t4.getText().equals("O") && t7.getText().equals("O")) {
                    t1.setEnabled(true);
                    t4.setEnabled(true);
                    t7.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t4.setBackground(Color.GREEN);
                    t7.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t4.removeMouseListener(this);
                    t7.removeMouseListener(this);
                }
                if (t2.getText().equals("O") && t5.getText().equals("O") && t8.getText().equals("O")) {
                    t2.setEnabled(true);
                    t5.setEnabled(true);
                    t8.setEnabled(true);
                    t2.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t8.setBackground(Color.GREEN);
                    t2.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t8.removeMouseListener(this);
                }
                if (t3.getText().equals("O") && t6.getText().equals("O") && t9.getText().equals("O")) {
                    t3.setEnabled(true);
                    t6.setEnabled(true);
                    t9.setEnabled(true);
                    t3.setBackground(Color.GREEN);
                    t6.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t3.removeMouseListener(this);
                    t6.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t1.getText().equals("O") && t5.getText().equals("O") && t9.getText().equals("O")) {
                    t1.setEnabled(true);
                    t5.setEnabled(true);
                    t9.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t3.getText().equals("O") && t5.getText().equals("O") && t7.getText().equals("O")) {
                    t3.setEnabled(true);
                    t5.setEnabled(true);
                    t7.setEnabled(true);
                    t3.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t7.setBackground(Color.GREEN);
                    t3.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t7.removeMouseListener(this);
                }

                if (O.equals("")) {
                    t1.setEnabled(false);
                }
                if (O1.equals("")) {
                    t2.setEnabled(false);
                }
                if (O2.equals("")) {
                    t3.setEnabled(false);
                }

                if (O3.equals("")) {
                    t4.setEnabled(false);
                }

                if (O4.equals("")) {
                    t5.setEnabled(false);
                }

                if (O5.equals("")) {
                    t6.setEnabled(false);
                }

                if (O6.equals("")) {
                    t7.setEnabled(false);
                }

                if (O7.equals("")) {
                    t8.setEnabled(false);
                }

                if (O8.equals("")) {
                    t9.setEnabled(false);
                }

                result.setText("O win");

            } else if ((X.equals("X") && X1.equals("X") && X2.equals("X"))
                    || (X.equals("X") && X3.equals("X") && X6.equals("X"))
                    || (X1.equals("X") && X4.equals("X") && X7.equals("X"))
                    || (X2.equals("X") && X5.equals("X") && X8.equals("X"))
                    || (X3.equals("X") && X4.equals("X") && X5.equals("X"))
                    || (X6.equals("X") && X7.equals("X") && X8.equals("X"))
                    || (X.equals("X") && X4.equals("X") && X8.equals("X"))
                    || (X2.equals("X") && X4.equals("X") && X6.equals("X"))) {
                l1.setVisible(false);

                if (t1.getText().equals("X") && t2.getText().equals("X") && t3.getText().equals("X")) {
                    t1.setEnabled(true);
                    t2.setEnabled(true);
                    t3.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t2.setBackground(Color.GREEN);
                    t3.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t2.removeMouseListener(this);
                    t3.removeMouseListener(this);
                }
                if (t4.getText().equals("X") && t5.getText().equals("X") && t6.getText().equals("X")) {
                    t4.setEnabled(true);
                    t5.setEnabled(true);
                    t6.setEnabled(true);
                    t4.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t6.setBackground(Color.GREEN);
                    t4.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t6.removeMouseListener(this);
                }
                if (t7.getText().equals("X") && t8.getText().equals("X") && t9.getText().equals("X")) {
                    t7.setEnabled(true);
                    t8.setEnabled(true);
                    t9.setEnabled(true);
                    t7.setBackground(Color.GREEN);
                    t8.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t7.removeMouseListener(this);
                    t8.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t1.getText().equals("X") && t4.getText().equals("X") && t7.getText().equals("X")) {
                    t1.setEnabled(true);
                    t4.setEnabled(true);
                    t7.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t4.setBackground(Color.GREEN);
                    t7.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t4.removeMouseListener(this);
                    t7.removeMouseListener(this);
                }
                if (t2.getText().equals("X") && t5.getText().equals("X") && t8.getText().equals("X")) {
                    t2.setEnabled(true);
                    t5.setEnabled(true);
                    t8.setEnabled(true);
                    t2.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t8.setBackground(Color.GREEN);
                    t2.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t8.removeMouseListener(this);
                }
                if (t3.getText().equals("X") && t6.getText().equals("X") && t9.getText().equals("X")) {
                    t3.setEnabled(true);
                    t6.setEnabled(true);
                    t9.setEnabled(true);
                    t3.setBackground(Color.GREEN);
                    t6.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t3.removeMouseListener(this);
                    t6.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t1.getText().equals("X") && t5.getText().equals("X") && t9.getText().equals("X")) {
                    t1.setEnabled(true);
                    t5.setEnabled(true);
                    t9.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t3.getText().equals("X") && t5.getText().equals("X") && t7.getText().equals("X")) {
                    t3.setEnabled(true);
                    t5.setEnabled(true);
                    t7.setEnabled(true);
                    t3.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t7.setBackground(Color.GREEN);
                    t3.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t7.removeMouseListener(this);
                }

                if (X.equals("")) {
                    t1.setEnabled(false);
                }
                if (X1.equals("")) {
                    t2.setEnabled(false);
                }
                if (X2.equals("")) {
                    t3.setEnabled(false);
                }

                if (X3.equals("")) {
                    t4.setEnabled(false);
                }

                if (X4.equals("")) {
                    t5.setEnabled(false);
                }

                if (X5.equals("")) {
                    t6.setEnabled(false);
                }

                if (X6.equals("")) {
                    t7.setEnabled(false);
                }

                if (X7.equals("")) {
                    t8.setEnabled(false);
                }

                if (X8.equals("")) {
                    t9.setEnabled(false);
                }

                result.setText("X win");

            }

        }

        if (random == 1) {

            if (n % 2 != 0) {
                if (fe.getSource() == t1) {

                    t1.setText("X");

                    t1.setEnabled(false);

                } else if (fe.getSource() == t2) {
                    t2.setText("X");
                    t2.setEnabled(false);
                } else if (fe.getSource() == t3) {
                    t3.setText("X");
                    t3.setEnabled(false);
                } else if (fe.getSource() == t4) {
                    t4.setText("X");
                    t4.setEnabled(false);
                } else if (fe.getSource() == t5) {
                    t5.setText("X");
                    t5.setEnabled(false);
                } else if (fe.getSource() == t6) {
                    t6.setText("X");
                    t6.setEnabled(false);
                } else if (fe.getSource() == t7) {
                    t7.setText("X");
                    t7.setEnabled(false);
                } else if (fe.getSource() == t8) {
                    t8.setText("X");
                    t8.setEnabled(false);
                } else if (fe.getSource() == t9) {
                    t9.setText("X");
                    t9.setEnabled(false);
                }
                l2.setVisible(false);
                l1.setVisible(true);
                ++n;

            }

            else {
                if (fe.getSource() == t1) {
                    t1.setText("O");
                    t1.setEnabled(false);

                } else if (fe.getSource() == t2) {

                    t2.setText("O");
                    t2.setEnabled(false);
                } else if (fe.getSource() == t3) {
                    t3.setText("O");
                    t3.setEnabled(false);
                } else if (fe.getSource() == t4) {
                    t4.setText("O");
                    t4.setEnabled(false);
                } else if (fe.getSource() == t5) {
                    t5.setText("O");
                    t5.setEnabled(false);
                } else if (fe.getSource() == t6) {
                    t6.setText("O");
                    t6.setEnabled(false);
                } else if (fe.getSource() == t7) {
                    t7.setText("O");
                    t7.setEnabled(false);
                } else if (fe.getSource() == t8) {
                    t8.setText("O");
                    t8.setEnabled(false);
                } else if (fe.getSource() == t9) {
                    t9.setText("O");
                    t9.setEnabled(false);
                }
                l1.setVisible(false);
                l2.setVisible(true);

                ++n;

            }

            O = t1.getText();
            O1 = t2.getText();
            O2 = t3.getText();
            O3 = t4.getText();
            O4 = t5.getText();
            O5 = t6.getText();
            O6 = t7.getText();
            O7 = t8.getText();
            O8 = t9.getText();

            X = t1.getText();
            X1 = t2.getText();
            X2 = t3.getText();
            X3 = t4.getText();
            X4 = t5.getText();
            X5 = t6.getText();
            X6 = t7.getText();
            X7 = t8.getText();
            X8 = t9.getText();

            if ((O.equals("O") && O1.equals("O") && O2.equals("O"))
                    || (O.equals("O") && O3.equals("O") && O6.equals("O"))
                    || (O1.equals("O") && O4.equals("O") && O7.equals("O"))
                    || (O2.equals("O") && O5.equals("O") && O8.equals("O"))
                    || (O3.equals("O") && O4.equals("O") && O5.equals("O"))
                    || (O6.equals("O") && O7.equals("O") && O8.equals("O"))
                    || (O.equals("O") && O4.equals("O") && O8.equals("O"))
                    || (O2.equals("O") && O4.equals("O") && O6.equals("O"))) {
                l2.setVisible(false);

                if (t1.getText().equals("O") && t2.getText().equals("O") && t3.getText().equals("O")) {
                    t1.setEnabled(true);
                    t2.setEnabled(true);
                    t3.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t2.setBackground(Color.GREEN);
                    t3.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t2.removeMouseListener(this);
                    t3.removeMouseListener(this);
                }
                if (t4.getText().equals("O") && t5.getText().equals("O") && t6.getText().equals("O")) {
                    t4.setEnabled(true);
                    t5.setEnabled(true);
                    t6.setEnabled(true);
                    t4.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t6.setBackground(Color.GREEN);
                    t4.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t6.removeMouseListener(this);
                }
                if (t7.getText().equals("O") && t8.getText().equals("O") && t9.getText().equals("O")) {
                    t7.setEnabled(true);
                    t8.setEnabled(true);
                    t9.setEnabled(true);
                    t7.setBackground(Color.GREEN);
                    t8.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t7.removeMouseListener(this);
                    t8.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t1.getText().equals("O") && t4.getText().equals("O") && t7.getText().equals("O")) {
                    t1.setEnabled(true);
                    t4.setEnabled(true);
                    t7.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t4.setBackground(Color.GREEN);
                    t7.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t4.removeMouseListener(this);
                    t7.removeMouseListener(this);
                }
                if (t2.getText().equals("O") && t5.getText().equals("O") && t8.getText().equals("O")) {
                    t2.setEnabled(true);
                    t5.setEnabled(true);
                    t8.setEnabled(true);
                    t2.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t8.setBackground(Color.GREEN);
                    t2.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t8.removeMouseListener(this);
                }
                if (t3.getText().equals("O") && t6.getText().equals("O") && t9.getText().equals("O")) {
                    t3.setEnabled(true);
                    t6.setEnabled(true);
                    t9.setEnabled(true);
                    t3.setBackground(Color.GREEN);
                    t6.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t3.removeMouseListener(this);
                    t6.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t1.getText().equals("O") && t5.getText().equals("O") && t9.getText().equals("O")) {
                    t1.setEnabled(true);
                    t5.setEnabled(true);
                    t9.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t3.getText().equals("O") && t5.getText().equals("O") && t7.getText().equals("O")) {
                    t3.setEnabled(true);
                    t5.setEnabled(true);
                    t7.setEnabled(true);
                    t3.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t7.setBackground(Color.GREEN);
                    t3.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t7.removeMouseListener(this);
                }

                if (O.equals("")) {
                    t1.setEnabled(false);
                }
                if (O1.equals("")) {
                    t2.setEnabled(false);
                }
                if (O2.equals("")) {
                    t3.setEnabled(false);
                }

                if (O3.equals("")) {
                    t4.setEnabled(false);
                }

                if (O4.equals("")) {
                    t5.setEnabled(false);
                }

                if (O5.equals("")) {
                    t6.setEnabled(false);
                }

                if (O6.equals("")) {
                    t7.setEnabled(false);
                }

                if (O7.equals("")) {
                    t8.setEnabled(false);
                }

                if (O8.equals("")) {
                    t9.setEnabled(false);
                }

                result.setText("O win");

            } else if ((X.equals("X") && X1.equals("X") && X2.equals("X"))
                    || (X.equals("X") && X3.equals("X") && X6.equals("X"))
                    || (X1.equals("X") && X4.equals("X") && X7.equals("X"))
                    || (X2.equals("X") && X5.equals("X") && X8.equals("X"))
                    || (X3.equals("X") && X4.equals("X") && X5.equals("X"))
                    || (X6.equals("X") && X7.equals("X") && X8.equals("X"))
                    || (X.equals("X") && X4.equals("X") && X8.equals("X"))
                    || (X2.equals("X") && X4.equals("X") && X6.equals("X"))) {
                l1.setVisible(false);
                if (t1.getText().equals("X") && t2.getText().equals("X") && t3.getText().equals("X")) {
                    t1.setEnabled(true);
                    t2.setEnabled(true);
                    t3.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t2.setBackground(Color.GREEN);
                    t3.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t2.removeMouseListener(this);
                    t3.removeMouseListener(this);
                }
                if (t4.getText().equals("X") && t5.getText().equals("X") && t6.getText().equals("X")) {
                    t4.setEnabled(true);
                    t5.setEnabled(true);
                    t6.setEnabled(true);
                    t4.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t6.setBackground(Color.GREEN);
                    t4.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t6.removeMouseListener(this);
                }
                if (t7.getText().equals("X") && t8.getText().equals("X") && t9.getText().equals("X")) {
                    t7.setEnabled(true);
                    t8.setEnabled(true);
                    t9.setEnabled(true);
                    t7.setBackground(Color.GREEN);
                    t8.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t7.removeMouseListener(this);
                    t8.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t1.getText().equals("X") && t4.getText().equals("X") && t7.getText().equals("X")) {
                    t1.setEnabled(true);
                    t4.setEnabled(true);
                    t7.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t4.setBackground(Color.GREEN);
                    t7.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t4.removeMouseListener(this);
                    t7.removeMouseListener(this);
                }
                if (t2.getText().equals("X") && t5.getText().equals("X") && t8.getText().equals("X")) {
                    t2.setEnabled(true);
                    t5.setEnabled(true);
                    t8.setEnabled(true);
                    t2.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t8.setBackground(Color.GREEN);
                    t2.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t8.removeMouseListener(this);
                }
                if (t3.getText().equals("X") && t6.getText().equals("X") && t9.getText().equals("X")) {
                    t3.setEnabled(true);
                    t6.setEnabled(true);
                    t9.setEnabled(true);
                    t3.setBackground(Color.GREEN);
                    t6.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t3.removeMouseListener(this);
                    t6.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t1.getText().equals("X") && t5.getText().equals("X") && t9.getText().equals("X")) {
                    t1.setEnabled(true);
                    t5.setEnabled(true);
                    t9.setEnabled(true);
                    t1.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t9.setBackground(Color.GREEN);
                    t1.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t9.removeMouseListener(this);
                }
                if (t3.getText().equals("X") && t5.getText().equals("X") && t7.getText().equals("X")) {
                    t3.setEnabled(true);
                    t5.setEnabled(true);
                    t7.setEnabled(true);
                    t3.setBackground(Color.GREEN);
                    t5.setBackground(Color.GREEN);
                    t7.setBackground(Color.GREEN);
                    t3.removeMouseListener(this);
                    t5.removeMouseListener(this);
                    t7.removeMouseListener(this);
                }

                if (X.equals("")) {
                    t1.setEnabled(false);
                }
                if (X1.equals("")) {
                    t2.setEnabled(false);
                }
                if (X2.equals("")) {
                    t3.setEnabled(false);
                }

                if (X3.equals("")) {
                    t4.setEnabled(false);
                }

                if (X4.equals("")) {
                    t5.setEnabled(false);
                }

                if (X5.equals("")) {
                    t6.setEnabled(false);
                }

                if (X6.equals("")) {
                    t7.setEnabled(false);
                }

                if (X7.equals("")) {
                    t8.setEnabled(false);
                }

                if (X8.equals("")) {
                    t9.setEnabled(false);
                }

                result.setText("X win");

            }

        }

        if (n > 9) {

            O = t1.getText();
            O1 = t2.getText();
            O2 = t3.getText();
            O3 = t4.getText();
            O4 = t5.getText();
            O5 = t6.getText();
            O6 = t7.getText();
            O7 = t8.getText();
            O8 = t9.getText();

            X = t1.getText();
            X1 = t2.getText();
            X2 = t3.getText();
            X3 = t4.getText();
            X4 = t5.getText();
            X5 = t6.getText();
            X6 = t7.getText();
            X7 = t8.getText();
            X8 = t9.getText();

            if ((O.equals("O") && O1.equals("O") && O2.equals("O"))
                    || (O.equals("O") && O3.equals("O") && O6.equals("O"))
                    || (O1.equals("O") && O4.equals("O") && O7.equals("O"))
                    || (O2.equals("O") && O5.equals("O") && O8.equals("O"))
                    || (O3.equals("O") && O4.equals("O") && O5.equals("O"))
                    || (O6.equals("O") && O7.equals("O") && O8.equals("O"))
                    || (O.equals("O") && O4.equals("O") && O8.equals("O"))
                    || (O2.equals("O") && O4.equals("O") && O6.equals("O"))) {

                result.setText("O win");

            } else if ((X.equals("X") && X1.equals("X") && X2.equals("X"))
                    || (X.equals("X") && X3.equals("X") && X6.equals("X"))
                    || (X1.equals("X") && X4.equals("X") && X7.equals("X"))
                    || (X2.equals("X") && X5.equals("X") && X8.equals("X"))
                    || (X3.equals("X") && X4.equals("X") && X5.equals("X"))
                    || (X6.equals("X") && X7.equals("X") && X8.equals("X"))
                    || (X.equals("X") && X4.equals("X") && X8.equals("X"))
                    || (X2.equals("X") && X4.equals("X") && X6.equals("X"))) {

                result.setText("X win");

            } else {
                l1.setVisible(false);
                l2.setVisible(false);
                result.setText("Match is Draw");
            }

        }
        if (fe.getSource() == exit) {
            dispose();
        }
    }

    public void mousePressed(MouseEvent fe) {

    }

    public void mouseReleased(MouseEvent fe) {

    }

    public void mouseEntered(MouseEvent fe) {

    }

    public void mouseExited(MouseEvent fe) {

    }

    public static void main(String[] args) {
        new ox();
    }
}
