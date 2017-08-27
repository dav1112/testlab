package swingBrowser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;




/*
 * Christopher Deckers (chrriis@nextencia.net)
 * http://www.nextencia.net
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */



/**
 * @author Christopher Deckers
 */
public class DjWebBrowser extends JFrame{
  public JComponent createContent() {
	JButton btnClose;
    JPanel contentPane = new JPanel(new BorderLayout());
    this.getContentPane().add(contentPane);
    JPanel webBrowserPanel = new JPanel(new BorderLayout());
    webBrowserPanel.setBorder(BorderFactory.createTitledBorder("ä¯ÀÀÆ÷Ô¤ÀÀ"));
    final JWebBrowser webBrowser = new JWebBrowser();
    webBrowser.navigate("http://10.131.172.170:8004/LMSView.aspx?type_numb=20483&CurrDeptNumb=H13&username=jwhf16&orgcode=H1304&orgoacode=DEPTH13103");
    webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
    contentPane.add(webBrowserPanel, BorderLayout.CENTER);
    btnClose = new JButton("¹Ø±Õ");
    contentPane.add(btnClose,BorderLayout.NORTH);
    //btnClose.setBackground(new Color(0,0,255,50));
    btnClose.addMouseListener(new MouseAdapter() {
   	 public void mouseClicked(MouseEvent e) {
   		DjWebBrowser.this.dispose();
   	 }
	});
    // Create an additional bar allowing to show/hide the menu bar of the web browser.
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 4));
    webBrowser.setMenuBarVisible(false);
    JCheckBox menuBarCheckBox = new JCheckBox("Menu Bar", webBrowser.isMenuBarVisible());
    menuBarCheckBox.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        webBrowser.setMenuBarVisible(e.getStateChange() == ItemEvent.SELECTED);
      }
    });
    buttonPanel.add(menuBarCheckBox);
    contentPane.add(buttonPanel, BorderLayout.SOUTH);
    return contentPane;
  }

  /* Standard main method to try that test as a standalone application. */
  public static void main(String[] args) {
    NativeInterface.open();
    //UIUtils.setPreferredLookAndFeel();
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
    	DjWebBrowser webBrowser = new DjWebBrowser();
    	webBrowser.createContent();
        webBrowser.setUndecorated(true);
        webBrowser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        webBrowser.setSize(800, 600);
        webBrowser.setLocationByPlatform(true);
        webBrowser.setVisible(true);
      }
    });
    NativeInterface.runEventPump();
  }

}