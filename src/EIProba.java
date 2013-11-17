import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class EIProba extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EIProba frame = new EIProba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EIProba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKaixo = new JLabel("Kaixo");
		lblKaixo.setBounds(73, 58, 70, 15);
		contentPane.add(lblKaixo);
		
		JLabel lblSartuZenbakiBat = new JLabel("Sartu zenbaki bat");
		lblSartuZenbakiBat.setBounds(169, 58, 176, 15);
		contentPane.add(lblSartuZenbakiBat);
		
		textField = new JTextField();
		textField.setBounds(164, 85, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("ok!");
		btnOk.setBounds(286, 82, 117, 25);
		contentPane.add(btnOk);
	}
}
