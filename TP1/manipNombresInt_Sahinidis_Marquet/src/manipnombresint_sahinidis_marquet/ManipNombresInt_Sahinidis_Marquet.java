/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint_sahinidis_marquet;

import java.util.Scanner;

/**
 *
 * @author matth
 */
public class ManipNombresInt_Sahinidis_Marquet {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1, nb2 ;
        System.out.println("Rentrez le premier nombre: ");
        Scanner sc;
        sc = new Scanner(System.in);
        nb1 = sc.nextInt();
        System.out.println("Rentrez le deuxieme nombre: ");
        nb2 = sc.nextInt();
        System.out.println("Vos nombres sont le: "+nb1+" et le  "+nb2);
        System.out.println("La somme des deux est: "+(nb1+nb2));
        System.out.println("La difference des deux est: "+(nb1-nb2));
        System.out.println("Le produit des deux est: "+(nb1*nb2));
        System.out.println("Le quotient entier de "+nb1+" et de "+nb2+" est: "+(nb1/nb2));
        System.out.println("Et le reste de la DE est: "+(nb1%nb2));
    }
    
}

 


