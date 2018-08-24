/*************************************
Tekijä: Ilse Tervonen   
Jakson numero: 2
Jakson tehtävänumero: 4
Päiväys: 24.5.2018
*************************************/
package javajakso2tehtavat;

import java.awt.*;

public class teht4 {
   public void paint(Graphics g)
   {
    int mikapaiva = 1;
    switch (mikapaiva)
        {
        case 1: g.drawString("Maanantai",10,20); break;
        case 2: g.drawString("Tiistai",10,20); break;
        case 3: g.drawString("Keskiviikko",10,20);break;
        case 4: g.drawString("Torstai",10,20); break;
        case 5: g.drawString("Perjantai",10,20); break;
        case 6: g.drawString("Lauantai",10,20); break;
        case 7:g.drawString("Sunnuntai",10,20); break;
        default: g.drawString("Ei ole sopiva kuukauden numero",10,20);
        }
    }
}