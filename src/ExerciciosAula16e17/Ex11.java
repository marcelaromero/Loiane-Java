package ExerciciosAula16e17;

import java.util.Scanner;

//        Faça um programa que receba dois números inteiros e gere os
//        números inteiros que estão no intervalo compreendido por eles, e no final mostre a soma dos numeros
public class Ex11 {
    public static void main(String[] args){
        int i, num1, num2, soma = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        for(i = num1; i <= num2; i++){
            soma += i;
        }
        System.out.println("Soma: " +soma);

    }
}
