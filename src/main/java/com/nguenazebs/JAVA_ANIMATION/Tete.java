package com.nguenazebs.JAVA_ANIMATION;

import java.awt.Graphics;
public class Tete extends Anneau{

	  protected double cap; 
	  public Tete(int xInit, int yInit, int rInit, double cInit)
	  {
	      super(xInit,yInit,rInit);
	      cap = cInit;
	  }
	  public Tete(int xInit, int yInit)
	  {
	      this(xInit,yInit,R,0.0);
	  } 
	  public void dessiner(Graphics g)
	  {
	    	g.fillOval(x-r, y-r, 2*r, 2*r);
	  } 
	  public void devierCap(double deltaC)
	  {
	      cap += deltaC;
	  }
	  public void deplacerSelonCap()
	  {
	       x = (int) (x + r * Math.cos(Math.PI*cap /180));
	       y = (int) (y + r * Math.sin(Math.PI*cap /180));
	  }
	   public boolean atteintBord(int xMax, int yMax)
	   {
	       return ((x < r) || (x > xMax - r) || (y < r) || (y > yMax - r));
	   }
	
}
