package Exercícios;

import java.util.Scanner;

public class RendaMes {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salário por hora e a quantidade de horas trabalhadas no mês: ");
        double salHora = scan.nextDouble();
        int horasMes = scan.nextInt();
        double totSalarioMes = salHora * horasMes;
        System.out.println("O salário total do mês é: " + totSalarioMes + "\n");

        double impostoRenda = totSalarioMes * 11/100;
        System.out.println("O imposto de renda é: " + impostoRenda + "\n");
        double inss = totSalarioMes * (8/100);
        System.out.println("O INSS é: " + inss + "\n");
        double sindicato = totSalarioMes * (5/100);
        System.out.println("O sindicato é: " + sindicato + "\n");

        double salarioLiquido = totSalarioMes - impostoRenda - inss - sindicato;        

        System.out.println("O salário líquido é: " + salarioLiquido);

    }
    
}
