package ExerciciosAula16e17;

/*
O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.
 */

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner entrada  =  new Scanner(System.in);

        int i, qtdTemp;
        double maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, temp, somaTemp = 0, media;

        System.out.println("Qtas temperaturas deseja informar: ");
        qtdTemp  =  entrada.nextInt();

        for (i = 0; i < qtdTemp; i++){
            System.out.println("Digite a temperatura: ");
            temp = entrada.nextDouble();

            somaTemp += temp;

            if(temp > maior){
                maior = temp;
            }else if( temp < menor){
                menor = temp;
            }
        }
        media = somaTemp / qtdTemp;
        System.out.println("maior temperatura: "+ maior);
        System.out.println("menor temperatura: "+ menor);
        System.out.println("Media das temperaturas: "+ media);


    }
}
