package ExercíciosAula19VetoresEArrays;

/*
    Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
    mesmo tipo e tamanho e com os elementos do vetor A multiplicados
    por 2, ou seja: B[i] = A[i] * 2.
 */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i;
        int [] vetorA = new int[8];
        int [] vetorB = new int[vetorA.length];

        for (i = 0; i < vetorA.length; i++){
            System.out.println("Digite um numero inteiro para o posiçao " + i);
            vetorA[i] = entrada.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("vetor A :");
        for (i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("vetor B :");
        for (i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
