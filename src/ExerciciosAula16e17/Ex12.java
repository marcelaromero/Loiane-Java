package ExerciciosAula16e17;

//        Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
//        qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
//        numero ele deseja ver a tabuada. A saída deve ser conforme o
//        exemplo abaixo:
//        o Tabuada de 5:
//        o 5 X 1 = 5
//        o 5 X 2 = 10
//        o ...
//        o 5 X 10 = 50

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        int num, i, tabuada;

        Scanner entrada  = new Scanner(System.in);
        System.out.println("Digite um numero para saber sua tabuada:");
        num = entrada.nextInt();

        for (i = 1; i <= 10; i++){
            tabuada = num * i;
            System.out.println(num + " x " + i +" : "+ tabuada);

        }
    }
}
