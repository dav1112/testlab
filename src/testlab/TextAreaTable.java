package testlab;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellRenderer;

public class TextAreaTable {
	private JTable areaTable;
	private AreaRender areaRender = new AreaRender();
	private TextAreaTable() {
		Object[] identify = {"value"};
		Object[][] values={{"qqqqqqqqqqqqqqqqq333333eeeeeeeeerrrr44444444444444444444rrrrrrrrrrrrrrrrrrrrrrrrrreee33qqqqqqqq"},
				{"eeeeeeeee222222222222eeeeeeeeeeeeeeeeee"}};
		areaTable = new JTable(values, identify);
		areaTable.setDefaultRenderer(Object.class, areaRender);
		areaTable.setRowHeight(70);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(areaTable);
		JPanel panel = new JPanel(new BorderLayout());
		panel.addComponentListener(new ComponentListener() {
			
			@Override
			public void componentShown(ComponentEvent e) {
				// TODO Auto-generated method stub
				areaRender.rowHeightSet.get(0);
				areaTable.setRowHeight(0, areaRender.rowHeightSet.get(0));
				areaTable.setRowHeight(1, areaRender.rowHeightSet.get(1));
			}
			
			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				//System.out.println(areaTable.getre);
				areaRender.rowHeightSet.get(0);
				areaTable.setRowHeight(0, areaRender.rowHeightSet.get(0));
				areaTable.setRowHeight(1, areaRender.rowHeightSet.get(1));
			}
			
			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub
				areaRender.rowHeightSet.get(0);
				areaTable.setRowHeight(0, areaRender.rowHeightSet.get(0));
				areaTable.setRowHeight(1, areaRender.rowHeightSet.get(1));
			}
			
			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		JTable table  =new JTable();
		table.setRowHeight(69);
		panel.add(scrollPane, BorderLayout.CENTER);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setContentPane(panel);
		frame.setSize(50,300);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				TextAreaTable at = new TextAreaTable();
			}
		});
	}
	class AreaRender implements TableCellRenderer {
		private JTextArea textArea;
		private JPanel panel;
		public HashMap<Integer,Integer> rowHeightSet;
		AreaRender() {
			rowHeightSet= new HashMap<Integer, Integer>();
			//panel = new JPanel(new FlowLayout(FlowLayout.LEADING));
			textArea = new JTextArea();
			textArea.setLineWrap(true);
			//panel.add(textArea);
		}
		public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
			String valueStr = (String)table.getValueAt(row, column);
			textArea.setText(valueStr);
			textArea.setSize(table.getWidth(), 50);
			//textArea.setPreferredSize(new Dimension(table.getWidth(), 100));
			//panel.setPreferredSize(new Dimension(table.getWidth(), 100));
			//panel.doLayout();
			//areaTable.setRowHeight(row, (int)panel.getPreferredSize().getHeight());
			rowHeightSet.put(row, (int)textArea.getPreferredSize().getHeight());
			System.out.println(textArea.getPreferredSize());
			return textArea;
		}
	}

}
