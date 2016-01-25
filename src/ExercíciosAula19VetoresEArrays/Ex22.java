package ExercíciosAula19VetoresEArrays;

/*
Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A.
 */

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] vetorA = new int[10];
        int qtd0 = 0,qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() * 1); // como funçao retorna um double colocamos a conversao para
            // inteiro ali no começo
            // o numero 1 ali na formula *1 sognifica o limite q quero, no caso de 0 ate 1
            // se quisesse ate 100 colocaria * 100

            if (vetorA[i] == 0){
                qtd0++;
            }else {
                qtd1++;
            }
        }
        // 10 - 100%
        // qtd0 - x
        // x = qtd0 * 100 / 10;

        double porc0 = (qtd0 * 100) / vetorA.length;
        double porc1 = (qtd1 * 100) / vetorA.length;

        System.out.print("vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Porcentagem de 0: " + porc0);
        System.out.println("Porcentagem de 1: " + porc1);
    }
}
