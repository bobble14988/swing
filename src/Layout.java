import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Layout extends JFrame {
  JPanel jPanel1 = new JPanel();
  JPanel jPanel2 = new JPanel();
  JPanel jPanel3 = new JPanel();
  BorderLayout borderLayout1 = new BorderLayout();
  GridLayout gridLayout1 = new GridLayout(4,3);
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  
  JButton jButton1 = new JButton("aaa");
  JButton jButton2 = new JButton("bbb");
  
  JCheckBox jCheckBox1 = new JCheckBox();
  JCheckBox jCheckBox2 = new JCheckBox();

  public Layout(){
    jPanel1.setLayout(borderLayout1);
    jLabel1.setText("Gustatzen?");
    jCheckBox1.setText("Bai");
    jCheckBox2.setText("Ez");
    jLabel2.setText("Aukeratu eta botoi bat sakatu");
    jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
    jPanel3.setLayout(gridLayout1);
    jRadioButton1.setText("A");//...
    jPanel3.add(jRadioButton1);
    jPanel3.add(jButton1);
    jPanel3.add(jButton2);
    jPanel3.add(jRadioButton2);//...
    jPanel2.add(jLabel1, null);
    jPanel2.add(jCheckBox1, null);
    jPanel2.add(jCheckBox2, null);
    jPanel1.add(jLabel2, BorderLayout.NORTH);
    jPanel1.add(jPanel3, BorderLayout.CENTER);
    jPanel1.add(jPanel2, BorderLayout.SOUTH);
    this.getContentPane().add(jPanel1, null);
  }
 public static void main(String[] args) {
	Layout l = new Layout();
	l.setSize(320, 200);
	l.setVisible(true);
}

}