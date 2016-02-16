package Aula27ClassesEMetodosComParametros;

/*
3.	Escreva uma class para representar um Aluno. Adicione atributos relacionados às caracteristicas de um Aluno,
como nome, matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas.

Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina.
Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao final informa o nome das
disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não.
 */

public class Aluno {
    String nomeAluno;
    String matricula;
    String curso;
    String [] nomeDisciplinas = new String[3];
    double [][] notasDisciplinas = new double[3][4];

    void mostrarInfo(){
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i=0; i<notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j=0; j<notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice){

        if (obterMedia(indice) >= 7){
            return true;
        }

        return false; // mesma coisa q fazer um else e o return dentro
    }

    double obterMedia(int indice){

        double soma = 0;

        for (int i=0; i<notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }

}
