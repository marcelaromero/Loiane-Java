package ExerciciosAula16e17;

import java.util.Locale;
import java.util.Scanner;

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

public class Ex25Outraforma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean sair = false;
        int i,qtdProdutos;
        double preco, total = 0, valorPago, troco;
        String continuarCompra;
        String output;


        do {
            System.out.println("Deseja informar uma nova compra? (S/N)");
            continuarCompra = entrada.next();

            if (continuarCompra.equalsIgnoreCase("s")){
                output = "Lojas Tabajara\n";

                System.out.println("Digite a quantidade de produtos da compra");
                qtdProdutos = entrada.nextInt();

                for (i = 1; i <= qtdProdutos; i++){
                    System.out.println("Informe valor do produto:  " +i);
                    preco = entrada.nextDouble();

                    total += preco;
                    output += "Produto " + i + ": R$ " +preco+ "\n";
                }

                output +=  "Total: R$ " + total;

                System.out.println("Total:  R$ "+ total);
                System.out.println("Entre com o valor pago");
                valorPago = entrada.nextDouble();
                output += "\nDinheiro: R$ " + valorPago + "\n";

                troco = total - valorPago;

                output += "Troco: R$ " + troco;

                System.out.println(output);

            }else{
                sair = true;
            }

        }while(!sair);

    }
}
