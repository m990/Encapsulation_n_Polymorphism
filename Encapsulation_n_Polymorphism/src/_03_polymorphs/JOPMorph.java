package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class JOPMorph extends Polymorph {

	JOPMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.magenta);
		g.fillRect(x, y, 50, 50);
	}

}
