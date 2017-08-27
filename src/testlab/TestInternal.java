package testlab;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestInternal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestInternal frame = new TestInternal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestInternal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(new JButton("22"));
		OpaqueInternalFrame jif = new OpaqueInternalFrame("333");
		//jif.setVisible(true);
		this.getRootPane().getLayeredPane().add(jif,0);
	}
	
	class OpaqueInternalFrame extends JInternalFrame{
		public OpaqueInternalFrame(String title){
			super(title,false,true);
			this.setOpaque(false);
			this.setSize(200, 100);
			this.setBackground(Color.white);
			this.setBackground(new Color(.3f,.3f,.3f,.3f));
			this.setVisible(true);
			//this.add(new JButton("222"));
		}
		@Override
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g.create();
			g2d.setColor(Color.black);
			g2d.setComposite(AlphaComposite.SrcOver.derive(0.6f));
			g2d.fillRect(0, 0, getWidth(), getHeight());
			g2d.dispose();
		}
	}

}
