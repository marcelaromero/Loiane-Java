package ExercíciosAula19VetoresEArrays;

/*
    Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
    mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
    ser o respectivo elemento de A multiplicado por sua posição (ou
    índice), ou seja:
    B[i] = A[i] * i.
 */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int i;
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];

        for (i = 0;i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " + i);
            vetorA[i]  = entrada.nextInt();

            vetorB[i] = vetorA[i] * i;
        }



        System.out.print("Vetor A ");
        for (i = 0;i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B ");
        for (i = 0;i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }



    }
}
