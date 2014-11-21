// Demo GridBagLayout

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoGridBag extends JFrame {

  private Container edukiontzia;
  private GridBagLayout eskema;
  private GridBagConstraints mugak;

  // IGa konfiguratu
 public DemoGridBag()
 {
	super( "GridBagLayout");

	edukiontzia = getContentPane();
	eskema = new GridBagLayout();

	edukiontzia.setLayout(eskema);
	
	// mugak ezartzeko objektua lortu
	mugak = new GridBagConstraints();

	// crear componentes de la GUI
	JTextArea textArea1 = new JTextArea("TextArea1", 5, 10);
	JTextArea textArea2 = new JTextArea("TextArea2", 2, 2);

	String izenak[] = {"Burdina", "Altzairua", "Kobre"};
	JComboBox zerrenda = new JComboBox(izenak);

	JTextField textfield = new JTextField("TextField");
	JButton botoi1 = new JButton("Botoi 1");
	JButton botoi2 = new JButton("Botoi 2");
	JButton botoi3 = new JButton("Botoi 3");

	// weightx eta weighty textArea1 osagaian = 0 (defektuzko balioa)
	mugak.fill = GridBagConstraints.BOTH;
	osagaiaGehitu( textArea1, 0,0, 1, 3);
	
	// weightx eta weighty botoi1 osagaian = 0 (defektuzko balioa)
	mugak.fill = GridBagConstraints.HORIZONTAL;
	osagaiaGehitu( botoi1, 0,1,2,1);

	// weightx eta weighty zerrendan = 0 (defektuzko balioa)
	// fill = HORIZONTAL
	osagaiaGehitu( zerrenda, 2,1, 2,1);

	// botoi2
	mugak.weightx = 1; // zabalagoa egin daiteke
	mugak.weighty = 1;    // altuagoa egin daiteke
	mugak.fill = GridBagConstraints.BOTH;
	osagaiaGehitu(botoi2, 1,1,1,1);

	// botoi3 osagaian, fill = BOTH 
	// mugak.fill = GridBagConstraints.HORIZONTAL;
	mugak.weightx = 0;
	mugak.weighty = 0;
	osagaiaGehitu(botoi3, 1,2,1,1);

	// weightx eta weighty textField osagaian = 0, fill = BOTH
	osagaiaGehitu(textfield, 3, 0, 2,1);

	// weightx eta weighty textArea2 osagaian = 0, fill = BOTH
	osagaiaGehitu(textArea2, 3, 2, 1,1);

	setSize(300,150);
	setVisible(true);

 } // eraikitzailea

 // mugak ezartzeko metodo laguntzailea
 private void osagaiaGehitu( Component osagaia,
	int errenkada, int zutabea, int zabalera, int altuera)
 {

	mugak.gridx = zutabea;
	mugak.gridy = errenkada;

	mugak.gridwidth = zabalera;
	mugak.gridheight = altuera;

	// mugak ezarri eta osagaiak edukiontzian sartu
	eskema.setConstraints (osagaia, mugak);
	edukiontzia.add(osagaia);	
 }

 public static void main(String args[])
 {
	DemoGridBag aplicacion = new DemoGridBag();
	aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 }

}
