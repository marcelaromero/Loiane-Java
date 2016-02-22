package Aula29Construtor;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // CONSTRUTORES
    Carro(){
        System.out.println("Classe carro foi instanciada");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_,double capCombustivel_, double consumoCombustivel_ ){
        marca = marca_;
        modelo = modelo_;
        numPassageiros_ = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    ////////////////////////////////
    // METODO SEM RETORNO
    void exibirAutonomia(){
        System.out.println("Autonomia do carro e de : " + capCombustivel * consumoCombustivel + " km");
    }

    // METODO COM RETORNO
    double obterAutonomia(){
        // return sempre ira no fim, pois antes posso ter uma mensagem
        // ou algum IF ou outra programação
        System.out.println("Metodo autonomia foi chamado");
        return capCombustivel;
    }

    // METODO COM PARÂMETRO
    double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
