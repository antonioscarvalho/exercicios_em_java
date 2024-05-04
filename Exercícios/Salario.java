package Exercícios;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salário por hora e a quantidade de horas trabalhadas no mês: ");
        double salHora = scan.nextDouble();
        int horasMes = scan.nextInt();

        double totSalarioMes = salHora * horasMes;

        System.out.println("O salário total do mês é: " + totSalarioMes);
    }
    
}
