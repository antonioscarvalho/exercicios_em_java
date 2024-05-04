package Exercícios;
import java.util.Scanner;

public class LendoCaracteres {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite seu nome: " + nome);

/*Digite seu nome: 
Antonio Nunes
Digite seu nome: Antonio Nunes */

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Digite seu primeiro nome: " + primeiroNome);

    }
}
