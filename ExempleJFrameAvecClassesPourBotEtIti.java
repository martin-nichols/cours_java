// Plusieurs Bot et Iti qui bougent 
// Utilise les classes BotRebondissant et ItiRebondissant du package Bonhommes 
import java.awt.*; 
import javax.swing.*;

import Bonhommes.*;

//import java.awt.event.*; 

 

public class ExempleJFrameAvecClassesPourBotEtIti extends JFrame { 

 

    // Constantes pour la taille de la fenetre et du Bot 
    private static final int LARGEURFENETRE = 800; 
    private static final int HAUTEURFENETRE = 800; 

 

    // Tampon pour construire l'image avant d'afficher 
    Graphics tamponGraphics;  
    Image tamponImage; 
     

 

    public ExempleJFrameAvecClassesPourBotEtIti() { 
        super("Ping pong avec classes pour Bot et Iti"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        this.setSize(LARGEURFENETRE,HAUTEURFENETRE); 
        this.setVisible(true); 
    } 

 

    public void paint (Graphics g) { 
        tamponImage = createImage(LARGEURFENETRE,HAUTEURFENETRE); 
        tamponGraphics = tamponImage.getGraphics(); 
         
        BotRebondissant bot1 = new Bonhommes.BotRebondissant(0,200,50,75,5,0); 
        BotRebondissant bot2 = new Bonhommes.BotRebondissant(100,100,200,400,-10,5); 
        ItiRebondissant iti1 = new Bonhommes.ItiRebondissant(200,300,80,80,6,6); 
        ItiRebondissant iti2 = new Bonhommes.ItiRebondissant(200,0,50,50,0,10); 
                 
 

        while(true){ 
            // Dessine les Bot et Iti 
            bot1.paint(tamponGraphics); iti2.paint(tamponGraphics);  
            iti1.paint(tamponGraphics); bot2.paint(tamponGraphics); 

 

            //Copie le tampon dans le contexte graphique de la fenetre 
            g.drawImage(tamponImage,0,0,this); 
            try {Thread.sleep(50);} 
            catch(InterruptedException uneException){ 
                System.out.println(uneException.toString());  
            } 
            // Efface les Bot et Iti du tampon 
            bot1.effacer(tamponGraphics); bot2.effacer(tamponGraphics);  
            iti1.effacer(tamponGraphics); iti2.effacer(tamponGraphics); 

 

            // Déplace les Bot et Iti 
            bot1.deplacer(LARGEURFENETRE, HAUTEURFENETRE);  
            bot2.deplacer(LARGEURFENETRE, HAUTEURFENETRE);  
            iti1.deplacer(LARGEURFENETRE, HAUTEURFENETRE);  
            iti2.deplacer(LARGEURFENETRE, HAUTEURFENETRE); 
        } 
    } 

 

    public static void main (String args[]) { 
        new ExempleJFrameAvecClassesPourBotEtIti(); 
    } 
} 