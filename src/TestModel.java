import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

class TestModel extends AbstractTableModel {

    List<TestRecord> records = new LinkedList<TestRecord>();

    private static class TestRecord {

        private int val = 0;
    }

    public void increment(int row, int col) {
        records.get(row).val++;
        fireTableCellUpdated(row, 0);
    }

    public void decrement(int row, int col) {
        records.get(row).val--;
        fireTableCellUpdated(row, 0);
    }

    public TestModel() {
        records.add(new TestRecord());
        records.add(new TestRecord());
    }

    @Override
    public Class<?> getColumnClass(int col) {
        if (col == 0) {
            return Integer.class;
        } else {
            return ButtonColumn.class;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return true;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return records.size();
    }

    @Override
    public Object getValueAt(int row, int col) {
        if (col == 0) {
            return records.get(row).val;
        } else if (col == 1) {
            return "+";
        } else {
            return "-";
        }
    }
}