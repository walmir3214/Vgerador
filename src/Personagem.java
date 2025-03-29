import java.util.ArrayList;
import java.util.Random;

public class Personagem {
    String nome;
    String classe;
    RolarAtributos.Raca raca;
    int forca;
    int destreza;
    int constituicao;
    int inteligencia;
    int sabedoria;
    int carisma;
    String backgrounds;



    ArrayList<String> habilidades = new ArrayList();


    @Override
    public String toString() {
        return
                "Personagem" + "\n" +
                "nome=" + nome + '\n' +
                "classe=" + classe + '\n' +
                "raça=" + raca + '\n' +
                "força=" + forca + '\n' +
                "destreza=" + destreza + '\n' +
                "constituição=" + constituicao + '\n' +
                "inteligência=" + inteligencia + '\n' +
                "sabedoria=" + sabedoria + '\n' +
                "carisma=" + carisma + '\n' +
                "background='" + backgrounds + '\n' +
                "habilidades=" + habilidades + '\n';
    }
}
