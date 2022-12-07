package com.nguenazebs.JAVA_ANIMATION;


import java.awt.Frame;
import java.awt.Color;
public class AppliVisage3 {

	private static final int NBCH = 4;

	public static void main(String[] args) {
		
int nbChenilles; // nombre de chenille a afficher
        
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
            if ( i % 2 != 0)
                chen[i] = new Chenille(d.getLargeur(),d.getHauteur(),10,10);
            else
                chen[i] = new ColorationChenille(d.getLargeur(),d.getHauteur(),10,10,
                new Color((float) Math.random(),
                (float) Math.random(), (float) Math.random()));
            d.ajouterObjet(chen[i]);
        }   
        while (true) {       
            for (int i = 0; i < nbChenilles; i++)
                chen[i].deplacer();        
            d.repaint();           
            d.pause(50);
            
        }

	}

}
