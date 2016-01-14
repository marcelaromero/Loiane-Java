package ExerciciosAula16e17;

//        Supondo que a população de um país A seja da ordem de 80000
//        habitantes com uma taxa anual de crescimento de 3% e que a
//        população de B seja 200000 habitantes com uma taxa de crescimento
//        de 1.5%. Faça um programa que calcule e escreva o número de anos
//        necessários para que a população do país A ultrapasse ou iguale a
//        população do país B, mantidas as taxas de crescimento.

public class Ex4 {
    public  static void main(String[] args){
        int cont = 0 , popA = 80000, popB = 200000;

        while (popA <= popB){
            popA += popA * 0.03;
            popB += popB * 0.015;
            cont++;
        }

        System.out.println("Em " + cont + " anos a população A será maior que população B");
    }
}
