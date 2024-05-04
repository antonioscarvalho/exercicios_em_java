package Exercícios;

import java.util.Scanner;

public class MediaArit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor da primeira nota: ");
        double a = scan.nextDouble();
        System.out.println("Digite o valor da segunda nota: ");
        double b = scan.nextDouble(); 
        System.out.println("Digite o valor da terceira nota: ");
        double c = scan.nextDouble();
        System.out.println("Digite o valor da quarta nota: ");
        double d = scan.nextDouble();

        System.out.println("Veja a média aritmética dos valores das quatro notas:\n");
        System.out.println("Média aritmética = " + (a + b + c + d) / 4 + "\n");

        scan.close();
        
    }
    
}
