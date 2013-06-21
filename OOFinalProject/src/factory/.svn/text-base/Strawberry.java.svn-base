package factory;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;



public class Strawberry extends Fruit{

	public Strawberry(){
		super();
		this.points = 8;
		this.radius = 50;
		this.isHit = false;
		this.center.x = new Random().nextInt(100) + 40;
		this.center.y = new Random().nextInt(200) + 50;
//		this.speed = 3;
	}
	
	public Strawberry( int speed ){
		super();
		this.points = 8;
		this.radius = 50;
		this.isHit = false;
		this.center.x = new Random().nextInt(100) + 40;
		this.center.y = new Random().nextInt(200) + 50;
		this.speed = speed;
	}
	
	public void move(){
		center.x = center.x + speed;
//		center.y = Math.abs(400-center.x);
		center.y = 400;
		//center.y = (int)(0.002*center.x*center.x + -4*center.x + 100);
	}
//	get image
	public BufferedImage getImage(){
		try {
			image = ImageIO.read( new File( "image/strawberry.png" ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
}
