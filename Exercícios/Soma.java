package Exercícios;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double a = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = scan.nextDouble();
        System.out.println("A soma dos dois números é: " + (a + b));
    }
    
}
