package ExerciciosAula16e17;

//        Faça um programa que leia 5 números e informe a soma e a média
//        dos números.

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        int i, num, soma = 0 ;
        double media;


        for (i = 1; i <= 5; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Numero: ");
            num = scan.nextInt();

            soma = soma + num;

        }
        media = soma / 5;
        System.out.println("Soma dos numeros digitados é: " + soma);
        System.out.println("Média dos números digitados é: " + media);
    }
}
