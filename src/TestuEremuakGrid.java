// Demo GridBagLayout

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestuEremuakGrid extends JFrame {

  private Container contenedor;
  private GridBagLayout esquema;
  private GridBagConstraints restricciones;

 // configurar la GUI
 public TestuEremuakGrid()
 {
	super( "GridBagLayout");

	contenedor = getContentPane();
	esquema = new GridBagLayout();

	contenedor.setLayout(esquema);

	// instanciar restricciones de GridBagLayout
	restricciones = new GridBagConstraints();

	// crear componentes de la GUI
	JLabel izena = new JLabel("Sartu zure izena:");
	JLabel mezua = new JLabel("Utzi zure mezua:");

	JTextField izenaText = new JTextField();
	JTextArea mezuaText = new JTextArea(4, 20);
	
		// weightx y weighty para areaTexto1 son 0: el valor predeterminado
	// anchor para todos los componentes es CENTER: el valor predeterminado
	restricciones.fill = GridBagConstraints.BOTH;
	restricciones.insets = new Insets(10,10,10,10);  //top left bottom right
	agregarComponente( izena, 0,1, 3, 1);
	
	agregarComponente( izenaText, 0,4, 2,1);
	
	agregarComponente( mezua, 1,1,3,1);
	restricciones.insets = new Insets(0,10,10,10);  
	restricciones.weightx = 1; // puede hacerse más ancho
	restricciones.weighty = 1;    // puede hacerse más largo
	agregarComponente(mezuaText, 2,1,5,5);



	setSize(300,200);
	setVisible(true);

 } // fin constructor

 // método para establecer restricciones
 private void agregarComponente( Component componente,
	int fila, int columna, int anchura, int altura)
 {

	// establecer gridx y gridy
	restricciones.gridx = columna;
	restricciones.gridy = fila;

	// establecer gridwidth y gridheight
	restricciones.gridwidth = anchura;
	restricciones.gridheight = altura;

	// establecer restricciones y agregar componente
	esquema.setConstraints (componente, restricciones);
	contenedor.add(componente);	
 }

 public static void main(String args[])
 {
	TestuEremuakGrid aplicacion = new TestuEremuakGrid();
	aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 }

}
