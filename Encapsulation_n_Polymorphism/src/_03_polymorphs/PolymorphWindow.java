package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph mouseMorph;
    Polymorph circleMorph;
    RedMorph redmorph = new RedMorph(100,100);
    Polymorph imageMorph;
    Polymorph JOPMorph;
    ArrayList<Polymorph> polymorphList = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	
   	 
   	 bluePoly = new BluePolymorph(50, 50);
   	 redPoly = new RedMorph(100, 100);
   	 circleMorph = new CircleMorph(150, 150);
   	 mouseMorph = new MouseFollowMorph(200, 200);
   	 imageMorph = new ImageMorph(250, 250);
   	 JOPMorph = new ImageMorph(350, 300);
   	 
   	 polymorphList.add(bluePoly);
   	 polymorphList.add(new RedMorph( 100,100));
   	 polymorphList.add(new MovingMorph(200, 200));
   	 polymorphList.add(circleMorph);
   	 polymorphList.add(mouseMorph);
   	 polymorphList.add(imageMorph);
   	 polymorphList.add(JOPMorph);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (Polymorph p: polymorphList) {
   		 System.out.println(p);
   		 p.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint(); 
   	 for (Polymorph p: polymorphList) {
   		p.update();
   	 }
   	  if ((MouseInfo.getPointerInfo().getLocation().getX() > 350) && (MouseInfo.getPointerInfo().getLocation().getX()) < 400) {
   		  System.out.println("x correct");
   		  if ((MouseInfo.getPointerInfo().getLocation().getY() < 400) && (MouseInfo.getPointerInfo().getLocation().getY() > 350)) {
   			  JOptionPane.showMessageDialog(null, "Clicked");
   		  }
   	  }
    }
}
