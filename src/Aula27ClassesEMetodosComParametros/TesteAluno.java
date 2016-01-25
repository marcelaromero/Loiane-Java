package Aula27ClassesEMetodosComParametros;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by Marcela on 21/01/2016.
 */
public class TesteAluno {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nomeAluno = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.curso = scan.next();

        System.out.println("Entre com a matricula");
        aluno.matricula = scan.next();

        //aluno.nomeDisciplinas = new String[3];
        for (int i=0; i<aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i=0; i<aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j=0; j<aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i=0; i<aluno.nomeDisciplinas.length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - reprovado");
            }
        }
    }
}
