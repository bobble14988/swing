package botoiak;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Osagaiak extends JFrame {
	private JButton bOnartu = new JButton();
	private JLabel lIzena = new JLabel("Sartu zure izena:");
	private JTextField tIzena = new JTextField(10);
	private JPanel panela = new JPanel();
	
	public Osagaiak() {
		setTitle("Botoien adibidea");
		
		bOnartu.setText("Onartu");
		bOnartu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"Kaixo " + tIzena.getText(), "Hey!",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		panela.add(lIzena);
		panela.add(tIzena);
		
		getContentPane().add(panela, BorderLayout.NORTH);
		getContentPane().add(bOnartu, BorderLayout.SOUTH);
	

	}

	
	public void bistaratu() {
		setSize(275, 125);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Osagaiak botoiak = new Osagaiak();
		botoiak.bistaratu();

	}

}