package testlab;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TestTabAdd extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestTabAdd frame = new TestTabAdd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	JButton btnRemove;
	JTabbedPane tabPane;
	/**
	 * Create the frame.
	 */
	public TestTabAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		tabPane = new JTabbedPane();
		tabPane.addTab("hello", new JPanel());
		contentPane.add(tabPane, BorderLayout.CENTER);
		
		btnRemove = new JButton();
		contentPane.add(btnRemove, BorderLayout.NORTH);
		btnRemove.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 tabPane.addTab("heoo", new JPanel());
			 }
		});
		tabPane.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				System.out.print("tabChanged");
			}
		});
		setContentPane(contentPane);
	}

}
