package com.nguenazebs.JAVA_ANIMATION;

import java.awt.Graphics;
import java.awt.Color;

public class ColorationChenille extends Chenille{

	 private Color couleur;
	  public ColorationChenille(int largeur,int hauteur,  int r, int nbAnneaux, Color coul)
	    {
	      super(largeur,hauteur,r,nbAnneaux);
	      couleur = coul;
	    }
	  public void dessiner(Graphics g)
	    {
	      Color c = g.getColor();
	      g.setColor(couleur);
	      super.dessiner(g);
	      g.setColor(c);
	    }

	
}
