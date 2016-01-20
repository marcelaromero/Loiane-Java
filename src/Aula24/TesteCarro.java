package Aula24;

/**
 * Created by Marcela on 20/01/2016.
 */
public class TesteCarro {
    public static void main(String[] args) {

        // OBJETO
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPssageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println();

        // OBJETO
        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPssageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}
