
import java.util.Scanner;

public class Condicionais03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("informe a sua idade : ");

        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 64) {
            System.out.println("Voce esta aprovado para o emprestimo !!! ");

        } else {

            System.out.printf("voce nao esta aprovado ");
        }

        System.out.println("qual o seu salario ? ");
        int sal = scanner.nextInt();

        System.out.println("quanto de emprestimo ? ");
        int emp = scanner.nextInt();


        System.out.println("quantas parcelas ? ");
        int parc = scanner.nextInt();

        if (parc >= 3 && parc <= 24) {
            System.out.println("emprestimo aprovado ");

        }
        if (parc< 3 || parc> 24){
            System.out.println("emprestimo negado");
        }


        double enp = sal * 0.3;
        double div = emp / parc;

        if (enp > div) {
            System.out.println("Emprestimo aprovado");

        }
        else {
            System.out.println("Emprestimo negado");
        }
    }
}

