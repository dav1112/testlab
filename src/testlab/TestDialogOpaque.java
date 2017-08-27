package testlab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestDialogOpaque extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TestDialogOpaque dialog = new TestDialogOpaque();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TestDialogOpaque() {
		setBounds(100, 100, 450, 300);
		getRootPane().setOpaque(false);
		getRootPane().setBackground(new Color(0, 0, 0, 0));
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(new Color(0, 0, 0, 0));
		this.setBackground(new Color(0, 0, 0, 0));
		
	}

}
