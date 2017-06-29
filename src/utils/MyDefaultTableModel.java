package utils;

import javax.swing.table.DefaultTableModel;

public class MyDefaultTableModel extends DefaultTableModel{
	
	public MyDefaultTableModel(Object[][] data, String[] columnNames) {
        super(data, columnNames);
    }
	
	public MyDefaultTableModel(String[] columnNames,int a) {
        super( columnNames, a);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

}
