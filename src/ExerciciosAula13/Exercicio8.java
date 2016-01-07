package ExerciciosAula13;

//Faça um Programa que pergunte quanto você ganha por hora e o
// número de horas trabalhadas no mês. Calcule e mostre o total do seu
// salário no referido mês.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Qto vc ganha por hora? ");
        double vhora = scan.nextDouble();

        System.out.println("Qtas horas vc trbalhou esse mes:" );
        double mes = scan.nextDouble();

        double resultado = vhora * mes;
        System.out.println("Valor a receber nesse mês é de: " + resultado);




    }
}
