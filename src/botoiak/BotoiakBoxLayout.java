package botoiak;

import javax.swing.*;

import java.awt.*;

public class BotoiakBoxLayout extends JFrame {
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JButton jButton3 = new JButton();

	private Entzule entzule = new Entzule();
	
	public BotoiakBoxLayout() {
		setTitle("Botoien adibidea");
		
		jButton1.setText("Ireki");
		jButton1.setActionCommand("ac1");
		
		jButton2.setText("Gorde");
		jButton2.setActionCommand("ac2");
		
		jButton3.setText("Ezeztatu");
		
		getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		getContentPane().add(jButton1);
		getContentPane().add(jButton2);
		getContentPane().add(jButton3);
	

	}

	private void entzuleakPrestatu() {
		jButton1.addActionListener(entzule);
		jButton2.addActionListener(entzule);
		jButton3.addActionListener(entzule);
		
	}
	
	public void bistaratu() {
		setSize(275, 125);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		BotoiakBoxLayout botoiak = new BotoiakBoxLayout();
		botoiak.bistaratu();
		botoiak.entzuleakPrestatu();

	}

}