package Aula27ClassesEMetodosComParametros;

/*
2.	Cria uma classe para representar uma conta corrente que possui um número,um saldo, um status que informa se ela é especial ou não, um limite.
Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), despositar dinheiro, consultar saldo e verificar se
o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.
 */

public class ContaCorrente {
    String  numero;
    String agencia;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;

    // METODO
    boolean realizarSaque(double valor){
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }else { // nao tem saldo na conta
            if (especial){
                // verificar se o limiteEspecial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= valor){
                    saldo -= valor;
                    return true;
                }else {
                    return false;
                }
            }else {
                return false; // nao é especial e nao tem saldo suficiente
            }
        }
    }

    void depositar(double valor){
        saldo += valor;
    }

    void consultarSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0 ;
    }

    void imprimirUSoCheque(){
        if (verificarUsoChequeEspecial()){
            System.out.println("Esta usando cheque especial");
        }else {
            System.out.println("Não esta usando cheque especial");
        }
    }

}
