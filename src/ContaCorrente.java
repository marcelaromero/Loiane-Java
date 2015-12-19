/**
 * Created by Marcela on 19/12/2015.
 */
public class ContaCorrente {
    int conta;
    int agencia;
    double saldo;
    String nome;

    public String getNome() { return this.nome;}
    public int getConta() { return this.conta;}
    public double getSaldo() { return  this.saldo;}
    public  int getAgencia(){ return this.agencia;}

    public void setAgencia(int agencia) { this.agencia = agencia;}
    public void setConta(int conta) { this.conta = conta;}
    public void setSaldo(int saldo) { this.saldo = saldo;}
    public void setNome( String nome) {this.nome = nome;}

    // criando um método

    void efetuarSaque(double valor){ this.saldo = this.saldo - valor;}
    void efetuarDeposito(double valor) {this.saldo = this.saldo + valor;}
    void imprimaSaldo(){
        System.out.println(this.saldo);
    }

}
