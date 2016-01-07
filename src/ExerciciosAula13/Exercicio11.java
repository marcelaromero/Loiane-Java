package ExerciciosAula13;

//Faça um Programa que peça 2 números inteiros e um número real.
//        Calcule e mostre:
//        a. o produto do dobro do primeiro com metade do segundo .
//        b. a soma do triplo do primeiro com o terceiro.
//        c. o terceiro elevado ao cubo.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite dois numeros inteiros:");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        System.out.println("Digite um numero real: ");
        double num3 = entrada.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow(num3,3);

        System.out.println("o produto do dobro do primeiro com metade do segundo  é: " + resultado1);
        System.out.println("a soma do triplo do primeiro com o terceiro é: " + resultado2);
        System.out.println("o terceiro elevado ao cubo é: " + resultado3);
    }
}
