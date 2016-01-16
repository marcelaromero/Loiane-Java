package ExerciciosAula16e17;

/*
Encontrar números primos é uma tarefa difícil. Faça um programa que
gera uma lista dos números primos existentes entre 1 e um número
inteiro informado pelo usuário.
 */

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um numero ");
        int num = entrada.nextInt();
        boolean primo;

        for (int i = 1; i <= num;i++ ){
            primo = true;

            for (int j=2; j< i; j++){
                if(i % j == 0){
                    //System.out.println("Não é primo");
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
            }

        }

    }
}
