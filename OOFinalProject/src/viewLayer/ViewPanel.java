package viewLayer;

//
//import java.awt.Dimension;

import javax.swing.JPanel;

import viewLayer.ViewFrame;

// ViewPanel extends JPanel which contain 
// viewFrame and add panel to frame
@SuppressWarnings("serial")
public class ViewPanel extends JPanel{
	protected ViewFrame gmf;
	public ViewPanel(){
	    gmf = new ViewFrame();
		gmf.getContentPane().add(this);
	}
	
}
