/*
 * TP0 Excercice 1 
 * Matthieu Sahinidis   
 * Septembre 2021
 */

package exo1;

import java.util.Scanner;

/**
 *
 * @author matth
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        System.out.println("Bonjour");
        int var,var1;
        var1=15;
        var=var1+5;
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom=sc.nextLine();
        System.out.println(prenom);
    }
}
