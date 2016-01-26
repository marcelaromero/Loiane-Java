package Aula20Matrizes;

/*
Capture do teclado valores para preenchimento de uma matriz M 3x3.
Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares.
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] matrizM = new int[3][3];

        for (int i=0; i< matrizM.length; i++){
            for (int j=0; j< matrizM[i].length; j++){
                System.out.println("Digite o valor para o posiçao linha " + i + " coluna " + j);
                matrizM[i][j] = entrada.nextInt();
            }
        }

        System.out.println("MATRIZ M");
        for (int i=0; i< matrizM.length; i++){
            for (int j=0; j< matrizM[i].length; j++){
                System.out.print(matrizM[i][j]+ " ");
            }
            System.out.println();
        }

        int qtdPares =0, qtdImpares = 0;

        for (int i=0; i< matrizM.length; i++){
            for (int j=0; j< matrizM[i].length; j++){
                if (matrizM[i][j] % 2 == 0){
                    qtdPares++;
                }else {
                    qtdImpares++;
                }
            }
        }

        System.out.println("Quantidade de pares: "+ qtdPares);
        System.out.println("Quantidade de impares: "+ qtdImpares);
    }
}
