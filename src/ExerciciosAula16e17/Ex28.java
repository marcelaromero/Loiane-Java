package ExerciciosAula16e17;

/*
Os números primos possuem várias aplicações dentro da
Computação, por exemplo na Criptografia. Um número primo é aquele
que é divisível apenas por um e por ele mesmo. Faça um programa
que peça um número inteiro e determine se ele é ou não um número
primo.
 */

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero para saber se é primo: ");
        num = entrada.nextInt();

        boolean primo = true;

        for (int i=2; i< num; i++){
            if(num % i == 0){
                System.out.println("Não é primo");
                primo = false;
            }
        }
        if (primo){
            System.out.println("É numero primo");
        }
    }
}
