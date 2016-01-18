package ExercíciosAula19VetoresEArrays;

/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.
 */

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, pares = 0 ;
        int [] vetorA = new int[10];

        for (i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor para posição " + i);
            vetorA[i] = entrada.nextInt();
              if (vetorA[i] % 2 == 0 ){
                  pares++;
              }
        }
        System.out.println("Quantidade de numeros pares é: " + pares);

    }
}
