package ExerciciosAula16e17;

/*
    O cardápio de uma lanchonete é o seguinte:

        o Especificação Código Preço
        o Cachorro Quente 100 R$ 1,20
        o Bauru Simples 101 R$ 1,30
        o Bauru com ovo 102 R$ 1,50
        o Hambúrguer 103 R$ 1,20
        o Cheeseburguer 104 R$ 1,30
        o Refrigerante 105 R$ 1,00

    Faça um programa que leia o código dos itens pedidos e as
    quantidades desejadas. Calcule e mostre o valor a ser pago por
    item (preço * quantidade) e o total geral do pedido. Considere
    que o cliente deve informar quando o pedido deve ser
    encerrado.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int codigo = 0, qtd,i ;
        double preçoTotal,valor = 0, totalPedido = 0;
        String continuarCompra;
        boolean sair = false;



        do {
            System.out.println("Deseja informar uma nova compra? s/n ");
            continuarCompra = entrada.next();


            if (continuarCompra.equalsIgnoreCase("s")){

                for (i = 1; i <= 6 ; i++){// 6 pois o cardapio possui 7 itens diferentes
                    System.out.println("Digite o codigo do produto: entre 100 e 105 ");
                    codigo = entrada.nextInt();

                    System.out.println("Digite a quantidade de produtos vendidos do codigo: " + codigo);
                    qtd = entrada.nextInt();

                        switch (codigo){
                            case 100: valor =  1.20 ; break;
                            case 101: valor =  1.30 ; break;
                            case 102: valor =  1.50 ; break;
                            case 103: valor =  1.20 ; break;
                            case 104: valor =  1.30 ; break;
                            case 105: valor =  1.00 ; break;
                        }

                        preçoTotal = valor * qtd;
                        System.out.println("valor: " + preçoTotal);

                        totalPedido += preçoTotal;

                }
                System.out.println("total: " + totalPedido);
            }else{
                sair = true;
            }

        }while(!sair);

    }
}
