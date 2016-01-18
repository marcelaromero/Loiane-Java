package ExercíciosAula19VetoresEArrays;

/*
    Criar um vetor A com 10 elementos inteiros. Escrever um programa
    que calcule e escreva: a) a soma de elementos armazenados neste
    vetor que são inferiores a 15; b) a quantidade de elementos
    armazenados no vetor que são iguais a 15; e c) a média dos
    elementos armazenados no vetor que são superiores a 15.
 */

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, somaInf = 0, igual = 0, somaSup = 0, superiores = 0;
        double media = 0;
        int [] vetorA = new int[10];

        for (i = 0; i < vetorA.length;i++){
            System.out.println("Digite valor na posição " + (i+1));
            vetorA[i] = entrada.nextInt();

            if (vetorA[i] < 15){
                somaInf += vetorA[i];
            }else if (vetorA[i] == 15){
                igual++;
            }else if (vetorA[i] > 15){
                superiores++;
                somaSup += vetorA[i];
                System.out.println(somaSup);
            }
        }
        media = somaSup / superiores;
        System.out.println("Soma dos elementos inferiores a 15: " + somaInf);
        System.out.println("Quantidade de elementos iguais a 15:  " + igual);
        System.out.println("Média dos elementos superiores a 15: " + media);
    }
}
