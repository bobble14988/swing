package Probak;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;


public class Taula1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	 public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	/**
	 * Create the panel.
	 */
	public Taula1() {
		 super(new GridLayout(3,4));
		 
		String[] zutabeIzen = {
				"Izena",
				"Prezio",
				"Kantitatea"};
		
		Object [][] datuak = {
		
			{"Kalimotxoa", new Float(1), new Integer(3)},
			{"Garagardoa", new Float(1), new Integer(1)},
			{"Mostoa", new Float(1), new Integer (2)}
		};

		JTable taula = new JTable(datuak, zutabeIzen);
		taula.setPreferredScrollableViewportSize(new Dimension(500, 70));
        taula.setFillsViewportHeight(true);
	}
	
	  private void printDebugData(JTable taula) {
	        int numRows = taula.getRowCount();
	        int numCols = taula.getColumnCount();
	        javax.swing.table.TableModel model = taula.getModel();
	 
	        System.out.println("Value of data: ");
	        for (int i=0; i < numRows; i++) {
	            System.out.print("    row " + i + ":");
	            for (int j=0; j < numCols; j++) {
	                System.out.print("  " + model.getValueAt(i, j));
	            }
	            System.out.println();
	        }
	        System.out.println("--------------------------");
	    }
	  
	  private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("Taula1");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Create and set up the content pane.
	        Taula1 newContentPane = new Taula1();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }
	 
	   

}