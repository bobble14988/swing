import javax.swing.*;
import java.awt.*;

public class TestuEremuak extends JFrame {
  JLabel jLabel1 = new JLabel("Sartu zure izena:", SwingConstants.LEFT);
  JTextField jTextField1 = new JTextField();
  JLabel jLabel2 = new JLabel("Utzi zure mezua:", SwingConstants.LEFT);
  JTextArea jTextArea1 = new JTextArea();

  public TestuEremuak(){

	this.setTitle("Testu-Eremuekin adibidea");
	JPanel internalPanel = (JPanel) this.getContentPane();
	
	jTextArea1.setMaximumSize( new Dimension ( 150, 30));
	jTextArea1.setColumns(10);	
	jTextArea1.setLineWrap(true);

	JPanel goia = new JPanel();
	goia.setAlignmentX(Component.LEFT_ALIGNMENT);
	goia.setLayout(new BoxLayout(goia, BoxLayout.X_AXIS));
   	goia.add(jLabel1);  
 	goia.add(jTextField1);


	JPanel behea = new JPanel(new GridLayout(2,1,10,10));
	behea.add(jLabel2);
	behea.add(jTextArea1);	

	internalPanel.add(goia, BorderLayout.NORTH);	
	internalPanel.add(behea, BorderLayout.CENTER);	
	this.pack();
  }
 public static void main(String[] args){
    TestuEremuak frame = new TestuEremuak();
    frame.setDefaultLookAndFeelDecorated(true);
    frame.setSize(300,200);
    frame.setVisible(true);
 }
}
