/**
 * Created by Marcela on 21/12/2015.
 */
public class DepositoSaque {
    public static void main(String[] args){
        ContaCorrente marcela = new ContaCorrente();

        marcela.ValorSaldoInicial(10000);
        marcela.efetuarDeposito(10000);
        marcela.efetuarSaque(4000);
        marcela.imprimaSaldo();
    }
}
