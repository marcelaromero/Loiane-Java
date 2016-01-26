package Aula20Matrizes;

/*
Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.
 */

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int [][] numerosAleatorios = new int[10][10];
        Random numRandom = new Random();

        for (int i =0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numRandom.nextInt(100);
            }
        }

        System.out.println("Imprimindo a Matriz ");
        for (int i =0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }



        int  maiorL5 = Integer.MIN_VALUE;
        int menorC5 = Integer.MAX_VALUE;
        //int linha5 = 5;
        //int coluna7 = 7;

        for (int i =0; i < numerosAleatorios[5].length; i++) {
            if (numerosAleatorios[5][i] >  maiorL5){
                maiorL5 = numerosAleatorios[5][i];
            }
            if (numerosAleatorios[5][i] <  menorC5){
                menorC5 = numerosAleatorios[5][i];
            }
        }
        System.out.println("Menor valor da linha 5: "+ menorC5);
        System.out.println("Maior valor da linha 5: "+ maiorL5);


        int  maiorL7 = Integer.MIN_VALUE;
        int menorC7 = Integer.MAX_VALUE;

        for (int i =0; i<numerosAleatorios.length;i++){
            if (numerosAleatorios[i][7] > maiorL7){
                maiorL7 = numerosAleatorios[i][7];
            }
            if (numerosAleatorios[i][7] < menorC7){
                menorC7 = numerosAleatorios[i][7];
            }
        }
        System.out.println("Menor valor da linha 7: "+ menorC7);
        System.out.println("Maior valor da linha 7: "+ maiorL7);


    }
}
