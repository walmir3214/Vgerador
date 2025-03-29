import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Ui ui = new Ui();
        ui.setVisible(true);
        ui.button1.addActionListener(e -> {
            RolarAtributos.executar(personagem);
            System.out.println(personagem);
            switch (personagem.raca) {
                case HUMANO:
                personagem.nome = RolarAtributos.nome();
                personagem.forca += 23;
                break;
                case ELFO:
                personagem.nome = RolarAtributos.nomeelfo();
                personagem.destreza += 23;
                break;
                case ANAO:
                personagem.nome = RolarAtributos.nomeanao();
                personagem.constituicao += 23;
                break;
                case HALFLING:
                personagem.nome = RolarAtributos.nomehalfling();
                personagem.carisma += 23;
                break;
            }
            ui.areaFicha.setText(personagem.toString());
       });


    }
}
