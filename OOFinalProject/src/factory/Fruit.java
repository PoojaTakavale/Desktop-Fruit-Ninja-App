package factory;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Fruit is the base class for all fruits
// simplify all fruit as circle
// which has center point and radius
// the speed is the velocity
// the image is the photo of this fruit
// points is the score the user will get if he/she hit this fruit
// isHit is default as false, is user hit fruit, isHit is true


public abstract class Fruit {
	protected int radius;
//	speed is the difference of x in time t
	protected int speed;
	protected Point center;
	protected boolean isHit;
	protected int points;
	protected BufferedImage image;
	
	
	public Fruit(){
		this.speed = 1; 
		this.radius = 20;
		this.center = new Point();
		this.isHit = false;
	}
//	define fruit move 
	public void move(){}
	
	/**
	 * Draw image of this object
	 * @param g
	 */
	public BufferedImage getImage(){
		return this.image;
	}
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public boolean isHit() {
		return isHit;
	}

	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}

	public int getPoints(){
		return this.points;
	}
	public void setPoints( int points ){
		this.points = points;
	}
}
