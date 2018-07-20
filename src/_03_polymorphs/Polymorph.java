package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int width;
    int height;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){

    }
    
    void setX(int X) {
    		X = x;
    }
    
    void setY(int Y) {
    		Y = y;
    }
    
    void setWidth(int w) {
    		width = w;
    }
    
    void setHeight(int h) {
    		height = h;
    }
    
    public abstract void draw(Graphics g);
}
