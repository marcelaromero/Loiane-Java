package ExerciciosAula16e17;

//        Faça um programa que receba dois números inteiros e gere os
//        números inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        int i, num1, num2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        for(i = num1; i <= num2; i++){
            System.out.println("Numero inteiro: " + i);
        }

    }
}
