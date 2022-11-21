import java.util.Scanner;

public class Condicionais01 {

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int nota4;
        double media = 6.6;


        System.out.println("digite a nota do aluno : ");
        nota1 = in.nextInt();


        System.out.println("Digite a segunda nota do aluno : ");
        nota2 = in.nextInt();

        int outra = (nota2);


        System.out.println("Digite a terceira nota do aluno  : ");
        nota3 = in.nextInt();

        System.out.println("digite a nota do aluno : ");
        nota4 = in.nextInt();

        float resultado = (nota1 + nota2 + nota3 +nota4)/4;

        System.out.printf("A media do aluno foi % 1f %n ", resultado);

        if(resultado >= 6.6){
            System.out.println("VOCE ESTA REPROVADO ");
        }
        else {
            System.out.println("VOCE ESTA APROVADO ");

        }
    }
}
