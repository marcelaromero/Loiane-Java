package ExerciciosAula16e17;

/*
Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo
abaixo:
o Montar a tabuada de: 5
Começar por: 4
o Terminar em: 7
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
o 5 X 4 = 20
o 5 X 5 = 25
o 5 X 6 = 30
o 5 X 7 = 35
 */

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        int num, i, tabuada, inicial,finalizar;
        String output;

        Scanner entrada  = new Scanner(System.in);

        System.out.println("Digite um numero para saber sua tabuada:");
        num = entrada.nextInt();
        System.out.println("Deseja iniciar a tabuada em qual numero?");
        inicial = entrada.nextInt();
        System.out.println("Deseja finalizar a tabuada em qual numero?");
        finalizar = entrada.nextInt();

        output = " \n\nMontar tabuada de: " +num + "\n";
        output += "Começar por: " + inicial + "\n";
        output += "Finalizar em: " +finalizar;

        System.out.println(output);

        for (i = inicial; i <= finalizar ; i++){
            tabuada = num * i;
            System.out.println(num + " x " + i +" : "+ tabuada);

        }
    }
}
