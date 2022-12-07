package com.nguenazebs.JAVA_ANIMATION;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Iterator;
import java.util.Vector;
public class Dessin extends Canvas{
 
    private Dimension offDimension;
    private Image offImage;
    private Graphics offGraphics = null;
    private Vector listeDesChenilles = new Vector();
    public int getLargeur() {
        return getWidth();
    }
    public int getHauteur() {
        return getHeight();
    }
    public void ajouterObjet(Chenille c) {
        
        if (! listeDesChenilles.contains(c)) {
            listeDesChenilles.add(c);
            repaint();
        }
    }
    public void pause(int durée) {
        try {
            Thread.currentThread().sleep(durée);
        } catch (Exception e) {}
    }
    public void update(Graphics g) {
        Dimension d = getSize();
        if ((offGraphics == null) || (d.width != offDimension.width)
        || (d.height != offDimension.height)) {
            offDimension = d;
            offImage = createImage(d.width, d.height);
            offGraphics = offImage.getGraphics();
        }
        offGraphics.setColor(getBackground());
        offGraphics.fillRect(0, 0, d.width, d.height);
        offGraphics.setColor(getForeground());
        dessinerLesChenilles(offGraphics);
        g.drawImage(offImage, 0, 0, this);
    }
    private void dessinerLesChenilles(Graphics g) {
        Iterator lesObjets = listeDesChenilles.iterator();
        while (lesObjets.hasNext()) {
            Chenille objCour = (Chenille)(lesObjets.next());
            objCour.dessiner(g);
        }
    }
    
	
}
