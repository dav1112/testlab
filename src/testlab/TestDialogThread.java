package testlab;

import java.awt.Dialog;

import javax.swing.JDialog;
import javax.swing.SwingUtilities;

public class TestDialogThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<10; i++) {
					Dialog dia = new JDialog();
					dia.setVisible(true);
					System.out.println(111);
				}
			}
		});
	}

}
