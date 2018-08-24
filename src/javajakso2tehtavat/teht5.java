/*************************************
Tekijä: Ilse Tervonen   
Jakson numero: 2
Jakson tehtävänumero: 5
Päiväys: 24.5.2018
*************************************/
package javajakso2tehtavat;

import java.awt.Graphics;

/* 5.4.	Ohjelma tulostaa sarjaa 1, 4, 16, 64, ..., kunnes sarjan jäsenen arvo on yli 1000.
 */
public class teht5 {
    public void paint(Graphics g)
    {
            for (int laskuri = 1; laskuri < 1000; laskuri = laskuri *4)
                g.drawString("Laskurin arvo on nyt " + laskuri, 10, 20 );
    }
}
