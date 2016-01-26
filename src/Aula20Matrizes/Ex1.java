package Aula20Matrizes;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 - 9.
Após isso determine o maior número da matriz e a sua posição
(linha, coluna).
 */

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int [][] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i =0; i < numerosAleatorios.length; i++){
            for (int j =0; j < numerosAleatorios[i].length; j++){
                //numerosAleatorios[i][j] = (int) Math.round(Math.random() * 9); ou outra forma de fazer
                // seria com a propria classe Random
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);// entre parenteses informe
                // ate que valor quero gerar numero aleatorio
            }
        }

        int maior = Integer.MIN_VALUE;
        int linha = 0, col = 0;

        for (int i =0; i < numerosAleatorios.length; i++){
            for (int j =0; j < numerosAleatorios[i].length; j++){
                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }

        System.out.println("Matriz");
        for (int i =0; i < numerosAleatorios.length; i++){
            for (int j =0; j < numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior " + maior);
        System.out.println("Linha " + linha);
        System.out.println("Coluna " + col);

    }
}
