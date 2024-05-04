package Exercícios;

import java.util.Scanner;

public class OperadoresArit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int a = scan.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = scan.nextInt(); 
        System.out.println("Digite o valor de C: ");
        int c = scan.nextInt();
        System.out.println("Veja diversas operações aritméticas com os valores de A, B e C:\n");
        System.out.println("a + b = " + (a + b));
        System.out.println("\na - b = " + (a - b));
        System.out.println("\na * b = " + (a * b));
        System.out.println("\nb / a = " + (b / a));
        System.out.println("\nb % a = " + (b % a));
        System.out.println("\nc % a = " + (c % a));
        System.out.println("\na++   = " + (a++));
        System.out.println("\na--   = " + (a--));
        // Verifica se o valor de A é igual ao valor de B
        System.out.println("\na == b = " + (a == b));
        // Verifica se o valor de A é diferente do valor de B
        System.out.println("\na != b = " + (a != b));
        // Verifica se o valor de A é maior que o valor de B
        System.out.println("\na > b = " + (a > b));
        // Verifica se o valor de A é menor que o valor de B
        System.out.println("\na < b = " + (a < b));
        // Verifica se o valor de A é maior ou igual ao valor de B
        System.out.println("\nb >= a = " + (b >= a));
        // Verifica se o valor de A é menor ou igual ao valor de B
        System.out.println("\nb <= a = " + (b <= a));

        System.out.println("\n\nA tabela verdade para o operador lógico E (&&) é:");
        System.out.println("false && false = " + (false && false));
        System.out.println("false && true  = " + (false && true));
        System.out.println("true  && false = " + (true && false));
        System.out.println("true  && true  = " + (true && true));

        System.out.println("\n\nA tabela verdade para o operador lógico OU (||) é:");   
        System.out.println("false || false = " + (false || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("true  || false = " + (true || false));
        System.out.println("true  || true  = " + (true || true));

        System.out.println("\n\nA tabela verdade para o operador lógico NÃO (!) é:");
        System.out.println("!false = " + (!false));
        System.out.println("!true  = " + (!true));

        scan.close();
        
    }
    
}
