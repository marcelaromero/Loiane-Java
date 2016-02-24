package Aula30;

public class Carro{
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // CONSTRUTOR
    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
        this.marca= marca; // fica explicito q o this.marca é o atributo da classe
        // e o marca é o parametro
        this.modelo= modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro( String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+ this.capCombustivel * this.consumoCombustivel + " km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel =  km/this.consumoCombustivel;
        return qtdCombustivel;
    }






}