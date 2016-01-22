package Aula27ClassesEMetodosComParametros;

/**
 * Created by Marcela on 21/01/2016.
 */
public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();

    }
}
