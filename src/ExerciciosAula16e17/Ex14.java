package ExerciciosAula16e17;

import java.util.Scanner;

/**
 Faça um programa que peça 10 números inteiros, calcule e mostre a
 quantidade de números pares e a quantidade de números impares.
 */

public class Ex14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num, i, pares = 0, impares = 0;

        for (i = 0;i < 10 ;i++){
            System.out.println("Digite um número: ");
            num = scan.nextInt();

            if(num % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("total de numeros pares: " + pares);
        System.out.println("total de numeros impares: " + impares);


    }
}
