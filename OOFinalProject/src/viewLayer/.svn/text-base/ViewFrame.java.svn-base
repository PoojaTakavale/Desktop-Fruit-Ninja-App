package viewLayer;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
// this class generate a basic JFrame for this game
// it contains a JPanel which later draw fruits on
// and define a basic Layout: BorderLayout

@SuppressWarnings("serial")
public class ViewFrame extends JFrame{
	
	private JPanel contentPane;
	private BorderLayout borderLayout1 = new BorderLayout();

//	init the frame 
	public ViewFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		this.setUndecorated(true);
		try {
			initialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Component initialization
	private void initialize() throws Exception {
		contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(borderLayout1);
	}
	
//	check the closed window request
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			System.exit(0);
		}
	}
}
