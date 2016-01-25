package ExercíciosAula19VetoresEArrays;

/*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação:
a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi;
c) Ci deverá receber -1 quando Ai for menor que Bi.
 */

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];

        for (int i =0; i<vetorA.length;i++){
            System.out.println("Digite um valor para o vetor A na posição "+ (i+1) );
            vetorA[i]= entrada.nextInt();
            System.out.println("Digite um valor para o vetor B na posição "+ (i+1) );
            vetorB[i]= entrada.nextInt();

            vetorC[i] = (vetorA[i] > vetorB[i]) ? 1 : -1;
            if (vetorA[i]==vetorB[i]){
                vetorC[i]=0;
            }
        }

        System.out.print("Vetor A ");
        for (int i =0; i<vetorA.length;i++){
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println();

        System.out.print("Vetor B ");
        for (int i =0; i<vetorA.length;i++){
            System.out.print(vetorB[i]+ " ");
        }
        System.out.println();

        System.out.print("Vetor C ");
        for (int i =0; i<vetorA.length;i++){
            System.out.print(vetorC[i]+ " ");
        }

    }
}
