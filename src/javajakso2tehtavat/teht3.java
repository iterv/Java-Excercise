/*************************************
Tekijä: Ilse Tervonen   
Jakson numero: 2
Jakson tehtävänumero: 3
Päiväys: 22.5.2018
*************************************/
package javajakso2tehtavat;
import java.io.Console;

/* 3.2	Ohjelma tarkistaa, onko muuttujassa oleva luku parillinen vai pariton. */

public class teht3 {
    public static void main(String[] args) {
    
    Console console = System.console();
    String syote = console.readLine();
    int x = Integer.parseInt(console.readLine());
    if ( (x > 50) && (x < 100) )
        System.out.println("luku on väliltä 50-100");
    }
}
