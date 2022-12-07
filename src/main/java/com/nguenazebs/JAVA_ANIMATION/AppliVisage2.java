package com.nguenazebs.JAVA_ANIMATION;

import java.awt.Frame;

public class AppliVisage2 {

	private static final int NBCH = 5;

	public static void main(String[] args) {
		int nbChenilles;

	     if (args.length == 0) 
	       nbChenilles = NBCH;
	     else
	       nbChenilles = Integer.parseInt(args[0]); 

	      Frame laFenetre = new Frame("Chenilles");
	      laFenetre.setSize(512,512);

	      Dessin d = new Dessin();
	      laFenetre.add(d);

	      laFenetre.show();

	      Chenille[]  chen = new Chenille[nbChenilles];
	      for (int i = 0; i < nbChenilles; i++) {
	         chen[i] = new Chenille(d.getLargeur(),d.getHauteur(),15,10);
	         d.ajouterObjet(chen[i]);
	      }

	      while (true)
	         {
	 
	           for (int i = 0; i < nbChenilles; i++)
	               chen[i].deplacer();

	            d.repaint();
	            
	            d.pause(50);

	         }
	      
	      
	      

	}

}
