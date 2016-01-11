package ExerciciosAula13;

//        Faça um programa que peça o tamanho de um arquivo para download
//        (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
//        informe o tempo aproximado de download do arquivo usando este link
//        (em minutos).

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Tamanho do arquivo: ");
        double tamArquivo = entrada.nextDouble();

        System.out.println("Velocidade link para download: ");
        double veloc = entrada.nextDouble();

        double tempo = tamArquivo / veloc;
        System.out.println("Velocidade final download em minutos: " + tempo + " minutos");

    }
}
