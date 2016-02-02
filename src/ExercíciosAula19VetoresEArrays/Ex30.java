package ExercíciosAula19VetoresEArrays;

/*
Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
que nos vetor B e C serão armazenados o valores pares e ímpares de
A, respectivamente.
 */

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; // pares
        int[] vetorC = new int[vetorA.length]; // ímpares

        // vetor A
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite valor para vetor A na posição " + i);
            vetorA[i] = scan.nextInt();
        }

        int posB = 0;
        int posC = 0;

        for (int i=0; i<vetorA.length; i++){

            if (vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            } else {
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


        System.out.print("Vetor B = ");
        for (int i=0; i<posB; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i=0; i<posC; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}
