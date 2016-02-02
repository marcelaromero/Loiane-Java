package ExercíciosAula19VetoresEArrays;

/*
Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
sendo este a junção dos dois outros vetores. Os primeiros 10
elementos de C deverão receber os elementos de A e os últimos
elementos C deverão receber os elementos de B. Desta forma, C
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
 */

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        //  vetor A
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite o valor do vetor A na posição " + i);
            vetorA[i] = entrada.nextInt();

            vetorC[i] = vetorA[i];
        }

        // vetor B
        for (int i=0; i<vetorB.length; i++){
            System.out.println("Digite o valor do vetor B na posição " + i);
            vetorB[i] = entrada.nextInt();

            vetorC[vetorA.length + i] = vetorB[i];
        }

        System.out.println("vetor A");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("vetor B");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println("vetor C");
        for (int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }

    }
}
