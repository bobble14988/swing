import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Konplexua extends JFrame {

 public void go(){
		Button aButton = new Button("Ezabatu");
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new FlowLayout());
		JTextArea jTextArea1 = new JTextArea();

		// Aukera botoiak sortu
		JRadioButton goizez = new JRadioButton("Goizez", true);
		JRadioButton arratsaldez = new JRadioButton("Arratsaldez", false);

		// Aukera botoi multzoa sortu, aukera botoiak elkartzeko
		ButtonGroup aukeraBotoiMultzoa = new ButtonGroup();
		aukeraBotoiMultzoa.add(goizez);
		aukeraBotoiMultzoa.add(arratsaldez);

		// Aukera zerrenda sortu eta aukeraz elikatu
		Vector<String> astegunak = new Vector<String>();
		JComboBox jComboBox1 = new JComboBox(astegunak);

		astegunak.addElement("Astelehena");
		astegunak.addElement("Asteartea");
		astegunak.addElement("Asteazkena");
		astegunak.addElement("osteguna");
		astegunak.addElement("Ostirala");

		// Panelak eraiki
		jPanel2.add(goizez);
		jPanel2.add(arratsaldez);
		jPanel2.add(jComboBox1);

		// Framean sartu goi-mailako panela, testu-area eta botoia
		this.setSize(320, 200);

		this.getContentPane().add(BorderLayout.NORTH, jPanel2);
		this.getContentPane().add(BorderLayout.CENTER, jTextArea1);
		this.getContentPane().add(BorderLayout.SOUTH, aButton);

		this.setVisible(true);
	}

  public static void main(String[] args) {
	Konplexua k = new Konplexua();
	k.go();
}

}