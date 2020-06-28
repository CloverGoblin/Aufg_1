package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

private javax.swing.JPanel jPanel1 = new JPanel();
private javax.swing.JLabel jlabel1 = new JLabel();
private javax.swing.JButton jbutton1 = new JButton();
private javax.swing.JLabel jlabel2 = new JLabel();
private javax.swing.JTextField jtextfield1 = new JTextField();

public MainFrame() {
  // frame settings
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setSize(400, 900);


  // jPanel1
  // jPanel1 = new JPanel();
  jPanel1.setLayout(new FlowLayout());
  jPanel1.setBackground(Color.cyan);

  // jlabel1
  jlabel1.setText("This is label1");
  jlabel1.setBackground(Color.green);

  // jbutton1
  jbutton1.setText("This is jbutton1");
  jbutton1.setBackground(Color.yellow);

  // jlabel2
  jlabel2.setText("This is jlabel2");
  jlabel2.setBackground(Color.RED);

  // jtextfield1

  jtextfield1.setText("this is some crazy jtextfield1");

  // put together
  // this.add(jPanel1);
  jPanel1.add(jbutton1);

  jPanel1.add(jlabel1);


  jPanel1.add(jbutton1);

  // this.add(jPanel1);

}
}
