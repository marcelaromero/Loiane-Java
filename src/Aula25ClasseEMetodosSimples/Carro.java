package Aula25ClasseEMetodosSimples;

/**
 * Created by Marcela on 20/01/2016.
 */
public class Carro {
    String marca;
    String modelo;
    int numPssageiros;
    double capCombustivel;
    double consumoCombustivel;

    // METODO
    void exibirAutonomia(){
        System.out.println("A  autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }
}
