package ExercíciosAula19VetoresEArrays;

/*
Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
 */

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double cotacao;
        double [] vetorA = new double[20];

        System.out.println("Qual a cotação do dolar: ");
        cotacao = entrada.nextDouble();

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = cotacao * (i+1); // pq vai de 1 a 20
        }

        DecimalFormat formatar = new DecimalFormat("###,###.##");

        System.out.println("Vetor A: ");
        for (int i=0; i < vetorA.length; i++){
            //System.out.println(vetorA[i] + " ");
            System.out.println(formatar.format(vetorA[i]) + " ");
        }
    }
}
