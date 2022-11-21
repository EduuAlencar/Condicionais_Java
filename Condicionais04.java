import java.util.Scanner;
import java.util.Random;

public class Condicionais04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       Random numero = new Random();


        System.out.printf("Escolha um numero : ");
        int esc = scanner.nextInt();

    if (esc <  0 || esc > 6  ){
        System.out.println("Escolha um numero entre 0 e 6  ");
    }


    else {
        int numb = numero.nextInt(6);
        System.out.println("O numero sorteado foi : " +numb);
        if (esc == numb){
            System.out.println("Voce acertou");
        } else {
            System.out.println("Voce errou");
        }
    }


    }

}
