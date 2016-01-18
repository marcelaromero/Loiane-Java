package ExerciciosAula16e17;

import java.util.Scanner;

/**
 * Created by Marcela on 18/01/2016.
 */
public class Ex30Loaine {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número para gerar a tabuada:");
        int num = scan.nextInt();

        boolean invalido = true;
        int numFinal, numInicio;

        do {

            System.out.println("Entre com o início da tabuada");
            numInicio = scan.nextInt();

            System.out.println("Entre como final da tabuada");
            numFinal = scan.nextInt();

            if (numFinal > numInicio){
                invalido = false;
            }

        } while (invalido);


        System.out.println("Tabuada de " + num + ":");
        System.out.println("Começar por: " + numInicio);
        System.out.println("Terminar em: " + numFinal);
        System.out.println();

        for (int i=numInicio; i<=numFinal; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
