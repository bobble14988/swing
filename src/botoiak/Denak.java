package botoiak;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Denak extends JFrame{


	
	
	public Denak() {
		super("Denak batera");
	}
	
	public void go() {
		
		setSize(275, 125);
		prestatuPanelak();
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	private void prestatuPanelak() {
		JPanel ertzak = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		ertzak.setLayout(new BorderLayout());
		ertzak.add(new JButton("Iparra"), BorderLayout.NORTH);
		ertzak.add(new JButton("Ekialdea"), BorderLayout.EAST);
		ertzak.add(new JButton("Erdialdea"), BorderLayout.CENTER);
		ertzak.add(new JButton("Mendebaldea"), BorderLayout.WEST);
		ertzak.add(new JButton("Hegoaldea"), BorderLayout.SOUTH);
	
		
		panel1.add(ertzak);
		
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(new JButton("Goian"));
		panel2.add(new JButton("Erdian"));
		panel2.add(new JButton("Behean"));
		
		((JPanel)getContentPane()).setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		getContentPane().add(panel1, BorderLayout.CENTER);
		getContentPane().add(panel2, BorderLayout.EAST);
		getContentPane().add(new JLabel("Hau hego aldean dago. Eraikitzailean JLabel.CENTER erabili dut.",JLabel.CENTER), BorderLayout.SOUTH);
	
	}

	public static void main(String[] args) {
	
		Denak d = new Denak();
		d.go();
		
	}
}
