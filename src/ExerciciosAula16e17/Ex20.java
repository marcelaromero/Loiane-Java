package ExerciciosAula16e17;

import java.util.Scanner;

/**
 Faça um programa que peça para n pessoas a sua idade, ao final o
 programa devera verificar se a média de idade da turma varia entre 0 e
 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
 ou idosa, conforme a média calculada.
 */
public class Ex20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int  numeroPessoas, i, idade, soma = 0;
        double media = 0;

        System.out.println("Digite a quantidade de pessoas: ");
        numeroPessoas = entrada.nextInt();

        for (i = 0; i < numeroPessoas; i++){
            System.out.println("Digite a idade da pessoa " + (i+1));
            idade = entrada.nextInt();

            soma += idade;
        }
        media = soma / numeroPessoas;

        if (media>=0 && media<=25){
            System.out.println("Turma Jovem");
        }else if (media>=26 && media<=60){
            System.out.println("Turma Adulta");
        }else{
            System.out.println("Turma Idosa");
        }
    }
}
