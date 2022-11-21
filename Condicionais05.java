import java.util.Scanner;
public class Condicionais05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n Bem vindo (a) ao banco . \n");

        boolean lValidaIdade = true;
        while (lValidaIdade) {

            System.out.println("Por favor informe a sua idade :");
            int idade = ler.nextInt();
            if (idade >= 18 && idade <= 65) {
                lValidaIdade = false;
            } else{
                System.out.println("opis voce nao tem idade para fazer o emprestimo ");
            }
        }
        System.out.println("Insira o seu salário:");
        double salario = ler.nextDouble();

        System.out.println("qual valor do credito ? ");
        double credito = ler.nextDouble();

        System.out.println("voce gostaria de pagar em quantas parcelas ?");
        int parcelas = ler.nextInt();

        boolean lValidaParcelas = true;
        while (lValidaParcelas) {

            if (parcelas >= 3 && parcelas <= 24) {
                lValidaParcelas = false;
            } else{
                System.out.println("Você deve escolher no mínimo 3 e no máximo 24 parcelas");
            }

        }
        double nemp = salario * 0.3;
        double parc = credito / parcelas;
        if(nemp > parc){
            System.out.println(" O credico foi aprovado . ");
        } else{
            System.out.println(" Credito reprovado ");
        }


    }
}