package Aula27ClassesEMetodosComParametros;

/*
1.	Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada
 */

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("A lampada esta ligada");
        }else{
            System.out.println("A lampada esta desligada ");
        }
    }

    // POSSO CHAMAR MÉTODO DENTRO DE MÉTODO
    void mudarEstado(){
        if (ligada){
            desligar();
        }else {
            ligar();
        }
    }

}
