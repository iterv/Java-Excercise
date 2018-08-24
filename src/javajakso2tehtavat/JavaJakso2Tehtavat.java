
package javajakso2tehtavat;

/*************************************
Tekijä: Ilse Tervonen   
Jakson numero: 2
Jakson tehtävänumero: 1
Päiväys: 22.5.2018
*************************************/

import java.util.Scanner;

public class JavaJakso2Tehtavat {

    
        /* 1 Muuttujat 1.2. 
        Mielestäni parempi notaatio on alaviivalla eroteltu useampi osainen muuttuja. Esim. kolmion_korkeus. Tämä on selkeämpi käyttäjälle, jottei tulisi liian helposti 
        luku- tai kirjoitusvirheitä, ja lisäksi tuolla notaatiolla on helpompi luoda toisistaan poikkeavia muuttujien nimiä (jotta nimet eivät vahingossa sekoitu).
*/
        
    public static void main(String[] args) {
        int a;
        int b;
        int c;
 
        Scanner in = new Scanner(System.in);

        System.out.println("Syötä kokonaisluku 1");
        a = in.nextInt();
        
        System.out.println("Syötä kokonaisluku 2");
        b = in.nextInt();
        
        System.out.println("Syötä kokonaisluku 3");
        c = in.nextInt();
        
        int summa = a + b + c;
        int erotus = a - b - c;
        int tulo = a * b * c;
        double osamaara = (double)a / b / c;

        
        System.out.println("Lukujen summa on "+ summa + ". Lukujen erotus on "+ erotus + "\nLukujen tulo on "+ tulo +". Lukujen osamäärä on "+ osamaara);
    }
    
}
