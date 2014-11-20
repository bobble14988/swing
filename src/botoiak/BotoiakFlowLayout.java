package botoiak;

import javax.swing.*;
import java.awt.*;

public class BotoiakFlowLayout extends JFrame {
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JButton jButton3 = new JButton();

	private Entzule entzule = new Entzule();
	
	public BotoiakFlowLayout() {
		setTitle("Botoien adibidea");
		
		jButton1.setText("Ireki");
		jButton1.setActionCommand("ac1");
		
		jButton2.setText("Gorde");
		jButton2.setActionCommand("ac2");
		
		jButton3.setText("Ezeztatu");
		
		FlowLayout flow = new FlowLayout();
		flow.setAlignment(FlowLayout.RIGHT);
		getContentPane().setLayout(flow);
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
		BotoiakFlowLayout botoiak = new BotoiakFlowLayout();
		botoiak.bistaratu();
		botoiak.entzuleakPrestatu();

	}

}