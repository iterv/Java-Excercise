/*************************************
Tekijä: Ilse Tervonen   
Jakson numero: 2
Jakson tehtävänumero: 5
Päiväys: 24.5.2018
*************************************/
package javajakso2tehtavat;

import java.util.Scanner;

public class teht6 { // 6.1. 
    public static void main(String[] args) {
        double b = Math.random();
        double c = Math.floor(b *20 +1);
        
        Scanner in = new Scanner(System.in);

        if (c % 2 == 04)
            System.out.println("Luku on parillinen");
        else
            System.out.println("Luku on pariton");
    }
}
  
/* 
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

*/