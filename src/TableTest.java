import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class TableTest extends JFrame {

    public TableTest() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = new JTable(new TestModel());
        table.getColumnModel().getColumn(1).setPreferredWidth(3);
        table.getColumnModel().getColumn(2).setPreferredWidth(3);
        this.add(new JScrollPane(table));
        Action increase = new AbstractAction("+") {

            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int row = Integer.valueOf(e.getActionCommand());
                TestModel model = (TestModel) table.getModel();
                model.increment(row, 0);
            }
        };
        ButtonColumn inc = new ButtonColumn(table, increase, 1);
        Action decrease = new AbstractAction("-") {

            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int row = Integer.valueOf(e.getActionCommand());
                TestModel model = (TestModel) table.getModel();
                model.decrement(row, 0);
            }
        };
        ButtonColumn dec = new ButtonColumn(table, decrease, 2);
        pack();
    }

    public static void main(String[] args) {
        new TableTest().setVisible(true);
    }
}