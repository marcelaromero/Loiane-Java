package Variavel;

/**
 * Created by Marcela on 15/12/2015.
 */
public class Variaveis {
    public static void main(String[] args){
        int idade = 20;

        // convenção Java
        String nome = "Marcela";
        String nomeDoMeuCachorro;

        // aceito, mas nao utilizado
        int _idade;
        int $idade;

        // não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 25;
        System.out.println("Idade : " + idade);

        // má prática, devemos dar nome das variveis q signifiquem
        // alguma coisa
        int a  = 10;
        String b = "Loiane";

    }
}
