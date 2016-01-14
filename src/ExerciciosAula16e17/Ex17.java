package ExerciciosAula16e17;

//        Faça um programa que calcule o fatorial de um número inteiro
//        fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

import java.util.Scanner;

public class Ex17 {
    public  static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para calcular seu fatorial: ");
        int num = entrada.nextInt();

        int i,fatorial = 1;

        for (i = num; i > 0 ; i--){
            fatorial *= i;
            //System.out.println(i);
        }
        System.out.println(num + "! é: " + fatorial );

    }
}
