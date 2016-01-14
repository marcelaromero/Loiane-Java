package ExerciciosAula16e17;

//        Faça um programa que peça um número inteiro e determine se ele é
//        ou não um número primo. Um número primo é aquele que é divisível
//        somente por ele mesmo e por 1.

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero para saber se ele é primo: ");
        num = entrada.nextInt();

        boolean primo = true;

        for (int i=2; i< num; i++){
            if(num % i == 0){
                System.out.println("Não é primo");
                primo = false;
            }
        }
        if (primo){
            System.out.println("é numero primo");
        }
    }
}
