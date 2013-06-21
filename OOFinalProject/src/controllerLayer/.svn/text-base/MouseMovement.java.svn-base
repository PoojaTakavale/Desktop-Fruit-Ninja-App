// chase mouse position and if mouse move to position
// that is closed enough to the fruit or on the top of the fruit
package controllerLayer;

import java.awt.Point;
// import an extra class for the MouseMotionListener 
import java.awt.event.*;

public class MouseMovement implements MouseMotionListener{
	private Point center;
	private Controller controller;

	public MouseMovement( Controller controller ){
		center = new Point();
		center.x = -100; 
		center.y = -100;
		this.controller = controller;
	}
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void mouseDragged(MouseEvent event) {
		
	}
	@Override
//	set position of mouse and check mouse hit fruit
	public void mouseMoved(MouseEvent event) {
		center.x = event.getX();
		center.y = event.getY();
		controller.hitFruit();
	}
	
}
