package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {
	BufferedImage image;
	ImageMorph(int x, int y) {
		super(x, y);
		//image = new BufferedImage("src/java1.jpg");
		 try {
			image = ImageIO.read(new File("java1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	
		
		g.drawImage(image, x, y, 50, 50, null);
	}

}
