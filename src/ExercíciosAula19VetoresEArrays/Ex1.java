package ExercíciosAula19VetoresEArrays;

/*
Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].
 */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i;
        int [] vetorA = new int[5];
        int [] vetorB = new int[vetorA.length]; // memso tamanho do vetorA, ao inves do colocar
        // o numero 5, que tbem poderia

        for (i = 0; i< vetorA.length ;i++){
            System.out.println("Digite um numero inteiro para posição " +i);
            vetorA[i] = entrada.nextInt();

            vetorB[i] = vetorA[i];
        }

        System.out.print("vetor A = ");

        for (i = 0; i< vetorA.length ;i++){
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println();

        System.out.print("vetor B = ");

        for (i = 0; i< vetorB.length ;i++){
            System.out.print(vetorB[i]+ " ");
        }
        System.out.println();




        }
}

