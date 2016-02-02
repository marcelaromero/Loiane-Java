package ExercíciosAula19VetoresEArrays;

/*
Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.
 */

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Digite um numero na posiçao " +i);
            vetorA[i] = entrada.nextInt();

            vetorB[vetorA.length - i - 1] = vetorA[i]; // exemplo i valendo 0, 10 - 0 -1 = 9
        }

        System.out.println("Vetor A:");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }
}
