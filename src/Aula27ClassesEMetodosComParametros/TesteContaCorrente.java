package Aula27ClassesEMetodosComParametros;

import Aula24ClasseObjetosAtributos.*;

/**
 * Created by Marcela on 21/01/2016.
 */
public class TesteContaCorrente {
    public static void main(String[] args){
        ContaCorrente conta = new ContaCorrente();

        conta.numero = "12345";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado){
            System.out.println("\nSaque realizado");
            conta.consultarSaldo();
        }else {
            System.out.println("Nao foi possivel realizar saque, saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("\nTentativa de saque de 500 reais");
            if (saqueEfetuado){
                System.out.println("\nSaque realizado");
                conta.consultarSaldo();
            }else {
                System.out.println("Nao foi possivel realizar saque, saldo insuficiente");
        }

        System.out.println("\nDeposito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();
        conta.imprimirUSoCheque();

        conta.realizarSaque(600);
        conta.consultarSaldo();
        conta.imprimirUSoCheque();
    }
}
