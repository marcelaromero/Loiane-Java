package ExercíciosAula19VetoresEArrays;

import java.util.Scanner;

/*
    Criar um vetor A com 10 elementos inteiros. Implementar um programa
    que defina e escreva a média aritmética simples dos elementos
    ímpares armazenados neste vetor.
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, impar=0, soma = 0;
        int [] vetorA = new int[10];
        double media = 0;

        for (i = 0;i <  vetorA.length; i++){
            System.out.println("Digite valor na posição " + i);
            vetorA[i] = entrada.nextInt();

            if (vetorA[i] % 2 != 0 ){
                impar++;
                soma += vetorA[i];
            }
        }

        media = soma / impar;
        System.out.println("Media: " + media);
    }
}
