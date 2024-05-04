package Exercícios;
// Objetivo: Ler vários dados de uma só vez.

import java.util.Scanner;

public class LendoVariosDados {

    public static void main(String[] args) {
        System.out.println("Digite seu primeiro nome, sua idade, sua altura e se você é casado(a) (responda True, se sim e False, se não):");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String nome = scan.next();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        boolean casado = scan.nextBoolean();
        System.out.println("Suas credenciais: \nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nCasado(a): " + casado);
    }
    
}
