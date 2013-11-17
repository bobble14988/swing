import javax.swing.*;
import java.awt.*;

public class TestuEremuak extends JFrame {
  JLabel jLabel1 = new JLabel();
  JTextField jTextField1 = new JTextField();
  JLabel jLabel2 = new JLabel();
  JTextArea jTextArea1 = new JTextArea();

  public TestuEremuak(){
	this.setTitle("Testu-Eremuekin adibidea");
   	jLabel1.setText("Sartu zure izena");
   	jTextField1.setColumns(25);
	jLabel2.setText("Utzi zure mezua");
	jTextArea1.setColumns(50);
   	jTextArea1.setRows(10);
	this.getContentPane().add(jTextArea1, BorderLayout.SOUTH);
  	this.getContentPane().add(jLabel2, BorderLayout.NORTH);
 	this.getContentPane().add(jTextField1, BorderLayout.CENTER);
   	this.getContentPane().add(jLabel1, BorderLayout.EAST);  
  }
 public static void main(String[] args){
    TestuEremuak frame = new TestuEremuak();
    frame.setSize(300,200);
    frame.setVisible(true);
 }
}