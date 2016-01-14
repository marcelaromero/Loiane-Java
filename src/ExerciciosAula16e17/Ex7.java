package ExerciciosAula16e17;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números e informe o maior número.
 */
public class Ex7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int i, num;
        int maior = Integer.MIN_VALUE; // menor numero possivel de existir

        for (i = 1; i <=5 ; i++ ){
            System.out.println("Digite um numero: ");
            num = entrada.nextInt();

            if (num > maior){
                maior = num;
            }
        }
        System.out.println("Maior numero é: " +maior);

    }

}
