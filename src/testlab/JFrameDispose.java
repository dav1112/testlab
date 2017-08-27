package testlab;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameDispose extends JFrame {

	JPanel contentPane ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(){
				JFrameDispose jd = new JFrameDispose();
				jd.setVisible(true);
			};
		});
	}
	/**
	 * Create the frame.
	 */
	public JFrameDispose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFrameDispose.this.dispose();
				//JFrameDispose.this.setVisible(false);
				JFrameDispose.this.dispose();
			}
		});
		this.addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				 System.out.println("close");
			 }
		});
		this.addWindowListener(new WindowAdapter() {
			 public void windowClosed(WindowEvent e) {
				 System.out.println("dispose");
			 }
		});
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		return ;
	}

}
