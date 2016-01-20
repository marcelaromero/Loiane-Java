package Aula25ClasseEMetodosSimples;

/**
 * Created by Marcela on 20/01/2016.
 */
public class TesteCarro {
    public static void main(String[] args) {
        // OBJETO
        Carro van = new Carro(); // declaraçao de uma variavel van do tipo carro
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPssageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println();

        // agora vamos chamar o metodo exibirAutonomia criado na classe Carro
        van.exibirAutonomia();

    }
}
