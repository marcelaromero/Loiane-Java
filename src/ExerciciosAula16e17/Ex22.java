package ExerciciosAula16e17;

/*
 Faça um programa que calcule o valor total investido por um
 colecionador em sua coleção de CDs e o valor médio gasto em cada
 um deles. O usuário deverá informar a quantidade de CDs e o valor
 para em cada um.
 */

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cd, i;
        double valorCd, media = 0, soma = 0;

        System.out.println("Informa q quantidade de Cds ");
        cd = entrada.nextInt();

        for (i=1; i<= cd; i++){
            System.out.println("Informe o valor do CD " + i);
            valorCd =  entrada.nextDouble();

            soma += valorCd;
        }
        media = soma / cd;
        System.out.println("Valor medio gasto nos Cds foram de R$" + media);
    }
}
