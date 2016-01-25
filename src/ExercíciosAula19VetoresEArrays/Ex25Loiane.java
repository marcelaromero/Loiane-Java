package ExercíciosAula19VetoresEArrays;

import java.util.Scanner;

/**
 * Created by Marcela on 25/01/2016.
 */
public class Ex25Loiane {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++){

            System.out.println("Entre com um número para a posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
