package com.nguenazebs.JAVA_ANIMATION;


import java.awt.Graphics;
import java.awt.Color;
public class Anneau {

	
	public final static int R = 5; 
	  protected int x; 

	  protected int y;

	  protected int r;

	  public Anneau(int xInit, int yInit, int rInit) {
	    this.x = xInit;
	    this.y = yInit;
	    this.r = rInit;
	      }

	  public Anneau(int xInit, int yInit) {
	    this(xInit,yInit,R);
	  }
	  int getX() {
	    return x;
	  }
	  
	  public int getY() {
	    return y;
	  }

	
	  public void placerA(int px, int py){
	      x = px;
	      y = py;
	  }

	  
	  public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void dessiner(Graphics g){
	      g.drawOval(x-r, y-r, 2*r, 2*r);
	  }
}
