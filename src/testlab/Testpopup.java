package testlab;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicPopupMenuUI;

import comp.PopUpComp;

public class Testpopup extends JFrame{
	JPanel popPanel = new JPanel();
	JPanel btnPanel = new JPanel();
	PopUpComp popupMenu;
	public Testpopup() {
		popupMenu = new PopUpComp(this);
		JButton add = new JButton("111");
		add.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				/**PopupFactory facotry = PopupFactory.getSharedInstance();
				Popup pop = facotry.getPopup(btnPanel, popPanel, 200, 200);
				pop.show();*/
				//btnPanel.setBackground(Color.black);
				popupMenu.show(btnPanel, 100, 100);
				
			}
		});
		btnPanel.add(add);
		this.setContentPane(btnPanel);
		
		
		this.addWindowFocusListener(new WindowFocusListener() {
			
			@Override
			public void windowLostFocus(WindowEvent e) {
				//popupMenu.hidePopup();
			}
			
			@Override
			public void windowGainedFocus(WindowEvent e) {
				
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Testpopup popup = new Testpopup();
				popup.setBounds(200, 200, 400, 500);
				popup.setVisible(true);
				popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
			}
		});
		
	}

}
