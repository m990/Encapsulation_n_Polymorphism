package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class MouseFollowMorph extends Polymorph {

	MouseFollowMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(x, y, 50, 50);
	}
	
	@Override
	public void update() {
		x = (int) MouseInfo.getPointerInfo().getLocation().getX();
		y = (int) MouseInfo.getPointerInfo().getLocation().getY();
	}

}
