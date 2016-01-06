package Operadores;

/**
 * Created by Marcela on 06/01/2016.
 */
public class CurtoCircuito {
    public static void main(String[] args){

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso &
                verdadeiro;
        boolean resultado2 = falso &&
                verdadeiro; // curto circuito

        System.out.println(resultado1);
        System.out.println(resultado2);


    }

}
