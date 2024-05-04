package Exercícios;

import java.util.Scanner;

public class Met_for_Cen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número em metros: ");
        double metros = scan.nextDouble();
        double metrosParaCentimetros = metros*100;
        System.out.println("O valor de " + metros + " metros em centímetros é: " + metrosParaCentimetros + " cm");
    }
    
}
