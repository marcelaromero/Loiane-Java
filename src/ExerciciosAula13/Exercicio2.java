package ExerciciosAula13;

//Faça um Programa que peça um número e então mostre a
//mensagem O número informado foi [número]

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Digite um numero: ");
        double num = scan.nextDouble();

        System.out.println("O número digitado foi: " + num);



    }
}
