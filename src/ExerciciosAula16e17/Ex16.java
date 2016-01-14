package ExerciciosAula16e17;

//        A série de Fibonacci é formada pela seqüência
//        0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
//        que o valor seja maior que 500.

public class Ex16 {
    public  static void main(String[] args){
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        do {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);

        }while(proximo < 500);

    }

}
