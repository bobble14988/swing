package botoiak;

import javax.swing.*;
import java.awt.*;

public class BotoiakAbsoluteLayout extends JFrame {
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JButton jButton3 = new JButton();

	private Entzule entzule = new Entzule();
	
	public BotoiakAbsoluteLayout() {
		setTitle("Botoien adibidea");
		
		jButton1.setText("Ireki");
		jButton1.setActionCommand("ac1");
		jButton1.setBounds(0, 0, 50, 50);
		
		jButton2.setText("Gorde");
		jButton2.setActionCommand("ac2");
		jButton2.setBounds(50, 0, 50, 50);
		
		jButton3.setText("Ezeztatu");
		jButton3.setBounds(100, 0, 50, 50);
		
		getContentPane().setLayout(null);
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
		BotoiakAbsoluteLayout botoiak = new BotoiakAbsoluteLayout();
		botoiak.bistaratu();
		botoiak.entzuleakPrestatu();

	}

}