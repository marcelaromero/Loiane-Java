package ExerciciosAula16e17;

/*
 O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,
 com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente
 deve pagar ele desenvolveu um tabela que contém o número de itens
 que o cliente comprou e ao lado o valor da conta. Desta forma a
 atendente do caixa precisa apenas contar quantos itens o cliente está
 levando e olhar na tabela de preços. Você foi contratado para
 desenvolver o programa que monta esta tabela de preços, que conterá
 os preços de 1 até 50 produtos, conforme o exemplo abaixo:
 o Lojas Quase Dois - Tabela de preços
 o 1 - R$ 1.99
 o 2 - R$ 3.98
 o ...
 o 50 - R$ 99.50
 */

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        int i;
        double valorCompra, valorCd = 1.99;

        for (i = 1; i <= 50; i++){
            valorCompra = i * valorCd;
            System.out.println( i + " Cds: R$" + valorCompra);
        }

    }
}
