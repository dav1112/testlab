package comp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.MenuElement;
import javax.swing.plaf.basic.BasicPopupMenuUI;

public class PopUpComp extends JPopupMenu implements MenuElement{
	
	public PopUpComp(JFrame frame) {
		JScrollPane sc = new JScrollPane();
		JPanel panel = new JPanel(new FlowLayout());
		sc.setViewportView(panel);
		panel.setPreferredSize(new Dimension(200, 200));
		//panel.setOpaque(true);
		panel.setBackground(new Color(100, 100, 100, 20));
		panel.add(new JButton("hello"));
		this.add(sc);
		//this.popup = PopupFactory.getSharedInstance().getPopup(frame, panel, 100, 100);
	}
	
	public void setUI(BasicPopupMenuUI ui) {
		super.setUI(ui);
	}
	
	/*@Override
	public void menuSelectionChanged(boolean isIncluded) {
		// TODO Auto-generated method stub
		System.out.println(isIncluded);
	}*/

}
