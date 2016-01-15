package ExerciciosAula16e17;

/*
O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
implantar a metodologia da tabelinha, que já é um sucesso na sua loja
de 1,99. Você foi contratado para desenvolver o programa que monta
a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
informado pelo usuário, conforme o exemplo abaixo:
o Preço do pão: R$ 0.18
o Panificadora Pão de Ontem - Tabela de preços
o 1 - R$ 0.18
o 2 - R$ 0.36
o ...
o 50 - R$ 9.00
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int i;
        double valorCompra = 0, valorPao;

        System.out.println("Informe o valor do pão: ");
        valorPao = entrada.nextDouble();

        for (i = 1; i <= 50; i++){
            valorCompra = i * valorPao;

            valorCompra = Double.valueOf(String.format(Locale.US, "%.2f", valorCompra)); // restringir para duas casas decimais

            System.out.println( i + " Cds: R$ " + valorCompra);
        }

    }
}
