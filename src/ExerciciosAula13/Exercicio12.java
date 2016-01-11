package ExerciciosAula13;
//        Tendo como dados de entrada a altura de uma pessoa, construa um
//        algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//        (72.7*altura) - 58

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Qual sua altura: ");
        double altura = entrada.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
