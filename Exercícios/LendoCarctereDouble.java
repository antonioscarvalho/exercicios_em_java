package Exercícios;
// Crie um programa que leia um número real e imprima o número lido.

import java.util.Scanner;

public class LendoCarctereDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double i = scan.nextDouble();
        System.out.println("Sua altura é: " + i);
    }
}