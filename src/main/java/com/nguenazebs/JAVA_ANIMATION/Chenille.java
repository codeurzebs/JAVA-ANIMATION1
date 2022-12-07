package com.nguenazebs.JAVA_ANIMATION;

import java.awt.Graphics;

public class Chenille extends Anneau {
	public Anneau[] lesAnneaux;
	public Tete laTete;
	public int largeur;
	public int hauteur;
	public Chenille(int largeur, int hauteur, int r, int nbAnneaux) {
		super(nbAnneaux, nbAnneaux);
		this.largeur = largeur;
		this.hauteur = hauteur;
		laTete=new Tete(largeur/2, hauteur/2, r, 0);
		int xTete=laTete.getX();
		int yTete=laTete.getY();
		lesAnneaux=new Anneau[nbAnneaux];
		for (int i = 0; i < lesAnneaux.length; i++) {
			lesAnneaux[i] = new Anneau(xTete - (i+1) * r, yTete, r);

		    }
	}
	 public void dessiner(Graphics g)
	    {
	      laTete.dessiner(g);
	      for (int i = 0; i < lesAnneaux.length; i++)
		lesAnneaux[i].dessiner(g);
	    }
	public void deplacer() {
		 
	    if (laTete.atteintBord(largeur,hauteur))
	      laTete.devierCap(90.0);
	    else
	      laTete.devierCap(-30.0 + Math.random()*60.0);
	    for (int i = lesAnneaux.length -1; i > 0; i--)
	      lesAnneaux[i].placerA(lesAnneaux[i-1].getX(), lesAnneaux[i-1].getY());

	    lesAnneaux[0].placerA(laTete.getX(),laTete.getY());

	    laTete.deplacerSelonCap();
	}
	
}
