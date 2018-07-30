package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	int i = 0;
	
	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillRect(x, y, 50, 50);
	}
	@Override
	public void update() {
		x = (int) (50 + Math.cos(i)*100);
		y = (int) (50 + Math.sin(i)*100);
		System.out.println(x + ' ' + y);
		i++;
	}

}
