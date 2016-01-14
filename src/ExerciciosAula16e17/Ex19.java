package ExerciciosAula16e17;

import java.util.Scanner;

/**
 * Faça um programa que calcule o mostre a média aritmética de N
 notas.
 */
public class Ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numNotas;
        double nota, soma = 0, media = 0;

        System.out.println("Qtas notas deseja digitar?");
        numNotas = entrada.nextInt();

        for (int i = 0; i < numNotas; i++){
            System.out.println("Digite a nota: ");
            nota = entrada.nextDouble();

            soma += nota;
        }

        media = soma/numNotas;
        System.out.println("Média: " + media);

    }
}
