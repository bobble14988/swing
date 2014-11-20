package botoiak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoiakBorderLayout extends JFrame {
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JButton jButton3 = new JButton();

	private Entzule entzule = new Entzule();
	
	public BotoiakBorderLayout() {
		setTitle("Botoien adibidea");
		
		jButton1.setText("Ireki");
		jButton1.setActionCommand("ac1");
		
		jButton2.setText("Gorde");
		jButton2.setActionCommand("ac2");
		
		jButton3.setText("Ezeztatu");
		getContentPane().add(jButton3, BorderLayout.EAST);
		getContentPane().add(jButton2, BorderLayout.CENTER);
		getContentPane().add(jButton1, BorderLayout.WEST);
	

	}

	private void entzuleakPrestatu() {
		jButton1.addActionListener(entzule);
		jButton2.addActionListener(entzule);
		jButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Anonymous class listener!");
				
			}
		});
		
	}
	
	public void bistaratu() {
		setSize(275, 125);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		BotoiakBorderLayout botoiak = new BotoiakBorderLayout();
		botoiak.bistaratu();
		botoiak.entzuleakPrestatu();

	}

}