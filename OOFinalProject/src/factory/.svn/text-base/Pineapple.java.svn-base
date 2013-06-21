package factory;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;



public class Pineapple extends Fruit{

	public Pineapple(){
		super();
		this.points = 6;
		this. radius = 50;
		this.isHit = false;
		this.center.x = new Random().nextInt(100)+ 30;
		this.center.y = new Random().nextInt(100) + 30;
//		this.speed = 5;
	}
	
	public Pineapple( int speed ){
		super();
		this.points = 6;
		this. radius = 50;
		this.isHit = false;
		this.center.x = new Random().nextInt(100)+ 30;
		this.center.y = new Random().nextInt(100) + 30;
		this.speed = speed;
	}
	
	public void move(){
		center.x = center.x + speed;
		center.y = Math.abs(400-center.x);
		center.y = 200;
		//center.y = (int)(0.003*center.x*center.x + -3*center.x + 80);
	}
//	get image of pineapple
	public BufferedImage getImage(){
		try {
			image = ImageIO.read( new File( "image/pineApple.png" ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
}
