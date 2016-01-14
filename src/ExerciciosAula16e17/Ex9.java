package ExerciciosAula16e17;

/**
 Faça um programa que imprima na tela apenas os números ímpares  entre 1 e 50.
 */
public class Ex9 {
    public static void main(String[] args){

        int i;
         for(i = 1; i <= 50; i++){
             if ( i % 2 != 0 ){
                 System.out.println("Numero impar: " + i);
             }
         }
    }
}
