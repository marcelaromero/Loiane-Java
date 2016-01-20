package Aula24ClasseObjetosAtributos;

/**
 * Created by Marcela on 20/01/2016.
 */
public class TesteLampada {
    public static void main(String[] arg){

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5]; // preciso sempre instanciar um array
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
    }
}
