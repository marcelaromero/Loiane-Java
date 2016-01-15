package ExerciciosAula16e17;

/*
O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
o Lojas Tabajara
o Produto 1: R$ 2.20
o Produto 2: R$ 5.80
o Produto 3: R$ 0
o Total: R$ 9.00
o Dinheiro: R$ 20.00
o Troco: R$ 11.00
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int i;
        double valorProd, valorCompra = 0, pagamento, troco;
        boolean parada = false;

        do {
            System.out.println("Valor do produto ");
            valorProd = entrada.nextDouble();

            System.out.println("P");

            valorCompra += valorProd;

            if(valorProd == 0)
            {
                parada = true;
            }

        }while(!parada);

        System.out.println(" ----------- TOTAL DA COMPRA: " + valorCompra);


        do {
            System.out.println("\n\nQual o valor em dinheiro para o pagamento: ");
            pagamento = entrada.nextDouble();

            if(pagamento < valorCompra){
                System.out.println("Dinheiro insuficiente para pagar a compra");
            }else{
                troco = pagamento - valorCompra;
                System.out.println("Valor do troco é R$ " + troco);
            }
        }while(pagamento < valorCompra);
    }
}
