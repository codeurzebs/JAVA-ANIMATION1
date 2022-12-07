package com.nguenazebs.JAVA_ANIMATION;

import java.awt.Frame;
public class AppliVisage1 {

	public static void main(String[] args) {
		
	      Frame laFenetre = new Frame("Chenilles");
	      laFenetre.setSize(512,512);
	      Dessin d = new Dessin();
	      laFenetre.add(d);
	      laFenetre.show();
	      Chenille  c1 = new Chenille(d.getLargeur(),d.getHauteur(),15,10);
	      d.ajouterObjet(c1);
	      while (true) {   
	    	  c1.deplacer();
	            d.repaint();            
	            d.pause(50);
	         }

	}

}
