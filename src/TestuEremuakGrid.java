// Demo GridBagLayout

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*  0    1     2      3      4      5      6
 *  +--------------------------------------+
    |    |     |      |      |      |      |
 1  +----+-----+------+------+------+------+
    |    |Sartu zure izena:  | ............|
 2  +----+-----+------+------+------+------+
    |    |Utzi zure mezua:   |      |      |
 3  +----+-----+------+------+------+------+
    |    | .............................   |
 4  +----+-.............................   +
    |    | .............................   |
 5  +----+-----+------+------+------+------+
 
*/
public class TestuEremuakGrid extends JFrame {

  private Container edukiontzia;
  private GridBagLayout eskema;
  private GridBagConstraints mugak;

 // IGa konfiguratu
 public TestuEremuakGrid()
 {
	super( "GridBagLayout");

	edukiontzia = getContentPane();
	eskema = new GridBagLayout();

	edukiontzia.setLayout(eskema);

	// mugak ezartzeko objektua lortu
	mugak = new GridBagConstraints();

	// IG osagaiak sortu
	JLabel izena = new JLabel("Sartu zure izena:");
	JLabel mezua = new JLabel("Utzi zure mezua:");

	JTextField izenaText = new JTextField(10);
	JTextArea mezuaText = new JTextArea(4, 20);
		
	gehituOsagaia( izena, 1,1, 3, 1);
	gehituOsagaia( izenaText, 1,4, 10,1);
	
	gehituOsagaia( mezua, 2,1,3,1);
	
//	mugak.fill = GridBagConstraints.BOTH;
//	mugak.weightx = 1;
//	mugak.weighty = 1;
//	mugak.insets = new Insets(10, 10, 10, 10);

	gehituOsagaia(mezuaText, 3,1,5,5);



	setSize(300,200);
	setVisible(true);

 } // erakitzailea

 // mugak ezartzeko metodo laguntzailea
 private void gehituOsagaia( Component osagaia,
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
	TestuEremuakGrid aplicacion = new TestuEremuakGrid();
	aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 }

}


// 	mugak.insets = new Insets(10, 10, 10, 10);
// mugak.fill = GridBagConstraints.HORIZONTAL;
