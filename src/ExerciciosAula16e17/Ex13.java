package ExerciciosAula16e17;

//        Faça um programa que peça dois números, base e expoente, calcule e
//        mostre o primeiro número elevado ao segundo número. Não utilize a
//        função de potência da linguagem.

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Ex13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double num1,num2, resultado = 1;
        int i;

        System.out.println("Digite a base:");
        num1 = entrada.nextDouble();
        System.out.println("Digite o expoente:");
        num2 = entrada.nextDouble();

        //resultado = Math.pow(num1,num2); ou podemos fazer com o Fors

        for(i = 1; i <= num2; i++){
            resultado *=  num1;
        }

        System.out.println("Resultado: " + resultado);
    }
}
