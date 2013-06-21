package factory;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;



public class Bomb extends Fruit {

	public Bomb(){
		super();
		this. radius = 50;
		this.isHit = false;
		this.center.x = new Random().nextInt( 50);
		this.center.y = new Random().nextInt( 300 );
//		this.speed = 10;
	}
	
	public Bomb( int speed ){
		super();
		this. radius = 50;
		this.isHit = false;
		this.center.x = new Random().nextInt( 50);
		this.center.y = new Random().nextInt( 300 );
		this.speed = speed;
	}
	
	public void move(){
		center.x = center.x + speed;
		center.y = Math.abs(400-center.x);
		//center.y = 100;
		//center.y = (int)(0.001*center.x*center.x + -2*center.x + 300);
	}
	public BufferedImage getImage(){
		try {
			image = ImageIO.read( new File( "image/bomb.png" ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
}