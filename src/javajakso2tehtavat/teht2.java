package javajakso2tehtavat;

/*************************************
Tekijä: Ilse Tervonen   
Jakson numero: 2
Jakson tehtävänumero: 2
Päiväys: 22.5.2018
*************************************/

/*2. Operaattorit: tehtävä 2.6 
Toteuta ohjelma, joka laskee aineen tiheyden, kun paino on 500 kiloa ja tilavuus on 2 kuutiometriä. */


public class teht2 {
    public static void main(String[] args) {
        
    double paino = 500;
    double tilavuus = 2;
    
    double tiheys = paino / tilavuus;
    
    System.out.println(tiheys);
    }
}