package Exercícios;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();
        
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
            
        double imc = peso / (altura * altura);
            
        System.out.println("O IMC é: " + imc);

        double PesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + PesoIdeal);
    }
    
}
