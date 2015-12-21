/**
 * Created by Marcela on 19/12/2015.
 */
public class ContaCorrente {
    int conta;
    int agencia;
    double saldo;
    String nome;
    static double cpmf;

    public String getNome() { return this.nome;}
    public int getConta() { return this.conta;}
    public double getSaldo() { return  this.saldo;}
    public  int getAgencia(){ return this.agencia;}
    public double getCpmf(){ return cpmf;}

    public void setAgencia(int agencia) { this.agencia = agencia;}
    public void setConta(int conta) { this.conta = conta;}
    public void setSaldo(double saldo) { this.saldo = saldo;}
    public void setNome( String nome) {this.nome = nome;}
    public void setCpmf( double cpmf){ContaCorrente.cpmf = cpmf; } // atributo deve ser acessado pelo nome da classe

    // criando métodos

    void ValorSaldoInicial(double valor){ this.saldo = valor;}
    void efetuarDeposito(double valor) {this.saldo = this.saldo + valor;}
    void efetuarSaque(double valor){ this.saldo = this.saldo - valor;}
    void imprimaSaldo(){
        System.out.println(this.saldo);
    }

}
