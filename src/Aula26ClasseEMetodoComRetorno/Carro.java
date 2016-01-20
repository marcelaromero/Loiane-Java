package Aula26ClasseEMetodoComRetorno;

/**
 * Created by Marcela on 20/01/2016.
 */
public class Carro {
    String marca;
    String modelo;
    int numPssageiros;
    double capCombustivel;
    double consumoCombustivel;

    // METODO SEM RETORNO
    void exibirAutonomia(){
        System.out.println("A  autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }

    // METODO COM RETORNO
    double obterAutonomia(){
        // return sempre ira no fim, pois antes posso ter uma mensagem
        // ou algum If ou outra programaçao
        System.out.println("Metodo autonomia foi chamado");
        return  capCombustivel * consumoCombustivel;
    }
}
