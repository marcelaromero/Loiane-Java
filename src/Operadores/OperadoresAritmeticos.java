package Operadores;

/**
 * Created by Marcela on 06/01/2016.
 */
    public class OperadoresAritmeticos {
    public static void main(String[] args){
        int resultado =  1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7; // resto da divisão
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma string concatenada";
        String terceitoNome = primeiroNome + segundoNome;
        System.out.println(terceitoNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        // e a mesma coisa q fazer isso
        resultado++;
        System.out.println(resultado);

        //valor de resultado ate agora é 5
        System.out.println(resultado++);
        // a mesma coisa que
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado += 1;

        System.out.println(++resultado);
        // a mesma coisa que
        //resultado += 1;
        //System.out.println(resultado);

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);

    }
}
