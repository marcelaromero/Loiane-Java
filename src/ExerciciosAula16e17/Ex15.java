package ExerciciosAula16e17;

//        A série de Fibonacci é formada pela seqüência
//        1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
//        até o n−ésimo termo.

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num, i;
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println("Entre com o  n−ésimo termo:");
        num = entrada.nextInt();

        System.out.println(primeiro);

        for (i = 3; i <= num; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }

    }
}
