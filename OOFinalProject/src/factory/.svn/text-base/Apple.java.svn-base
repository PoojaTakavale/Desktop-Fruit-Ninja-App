package factory;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

public class Apple extends Fruit{

	public Apple(){
		super();
		this.points = 5;
		this.radius = 60;
		this.isHit = false;
		this.center.x = new Random().nextInt(50);
		this.center.y = new Random().nextInt(500);
	}
	
	public Apple( int speed ){
		super();
		this.points = 5;
		this.radius = 60;
		this.isHit = false;
		this.center.x = new Random().nextInt(50);
		this.center.y = new Random().nextInt(500);
		this.speed = speed;
	}
//	set move path of apple
	public void move(){
		center.x = center.x + speed;
//		center.y = 100;
		center.y = Math.abs(400-center.x);
	}
	
//	set image apple by loading image from file
	public BufferedImage getImage(){
		try {
			image = ImageIO.read( new File( "image/apple.png" ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
}
