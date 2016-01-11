package ExerciciosAula13;

//13. Faça um Programa que pergunte quanto você ganha por hora e o
//        número de horas trabalhadas no mês. Calcule e mostre o total do seu
//        salário no referido mês, sabendo-se que são descontados 11% para o
//        Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
//        programa que nos dê:
//        . salário bruto.
//        a. quanto pagou ao INSS.
//        b. quanto pagou ao sindicato.
//        c. o salário líquido.
//        d. calcule os descontos e o salário líquido, conforme a tabela
//        abaixo:
//        + Salário Bruto : R$ - IR (11%) : R$ - INSS
//        (8%) : R$ - Sindicato ( 5%) : R$ = Salário
//        Liquido : R$
//        Obs.: Salário Bruto - Descontos = Salário Líquido.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Quanto vc ganha por hora: ");
        double vhora = entrada.nextDouble();

        System.out.println("Numero de horas trabalhadas no mês: ");
        double mes = entrada.nextDouble();

        double salario  = vhora * mes;
        double IR = salario * 0.11;
        double INSS = salario * 0.08;
        double Sind = salario * 0.05;

        double descontos = IR + INSS + Sind;

        double salBruto = salario - descontos;
        System.out.println("INSS: " + INSS);
        System.out.println("Sindicado: " + Sind);
        System.out.println("Total Descontos: " + descontos);
        System.out.println("Salario Liquido: " + salBruto);
    }
}
