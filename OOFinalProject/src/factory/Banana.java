package factory;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Banana extends Fruit {
	
	public Banana(){
		super();
		this. radius = 60;
		this.points = 1;
		this.isHit = false;
		this.center.x = new Random().nextInt( 60);
		this.center.y = new Random().nextInt( 500);
//		this.speed = 8;
	}
	
	public Banana( int speed ){
		super();
		this. radius = 60;
		this.points = 1;
		this.isHit = false;
		this.center.x = new Random().nextInt( 60);
		this.center.y = new Random().nextInt( 500);
		this.speed = speed;
	}
	
	public void move(){
		center.x = center.x + speed;
//		center.y = Math.abs(400-center.x);
		center.y = 200;
		//center.y = (int)(0.001*center.x*center.x + -3*center.x + 100);
	}
	public BufferedImage getImage(){
		try {
			image = ImageIO.read( new File( "image/banana.png" ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
}
