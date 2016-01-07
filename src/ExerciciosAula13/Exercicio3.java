package ExerciciosAula13;

// um Programa que peça dois números e imprima a soma.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Digite dois numeros inteiros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int resultado = num1 + num2;

        System.out.println("O resultado da soma dos numeros é: " + resultado);
    }
}
