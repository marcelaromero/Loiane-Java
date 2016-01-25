package ExercíciosAula19VetoresEArrays;

/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 1 quando Ai for par;
b) Bi deverá receber 0 quando Ai for ímpar.
 */

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i=0;i< vetorA.length;i++){
            System.out.println("Digite um numero para a posição " + (i+1));
            vetorA[i] = entrada.nextInt();
        }

        for (int i=0;i< vetorB.length;i++){
            if (vetorA[i] % 2 == 0){
                vetorB[i]=1;
            }else {
                vetorB[i]=0;
            }
        }
        System.out.print("Vetor A ");
        for (int i=0;i< vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B ");
        for (int i=0;i< vetorA.length;i++){
            System.out.print(vetorB[i] + " ");
        }


    }

}
