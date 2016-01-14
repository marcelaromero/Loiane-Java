package ExerciciosAula16e17;

import java.util.Scanner;

/**
 Faça um programa que calcule o número médio de alunos por turma.
 Para isto, peça a quantidade de turmas e a quantidade de alunos para
 cada turma. As turmas não podem ter mais de 40 alunos.
 */
public class Ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAlunos = 0, numeroTurmas = 0, soma = 0;
        boolean invalido = true;
        double media = 0;

        System.out.println("Qtas turmas?");
        numeroTurmas  = entrada.nextInt();

        for (int i = 1; i<= numeroTurmas; i++){
            invalido = true;
            do {
                System.out.println("Numero de alunos da turma " +i );
                numAlunos = entrada.nextInt();

                if (numAlunos <= 40){
                    invalido = false;
                }else {
                    System.out.println("Digite novamente, turma precisa ser menor que 40");
                }
            }while(invalido);

            soma += numAlunos;
        }
        media = soma / numeroTurmas;
        System.out.println("Media de alunos por turma: " + media);
    }
}
