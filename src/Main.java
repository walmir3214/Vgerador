import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Main {


    public static void main(String[] args) {
        Rosto rosto = new Rosto();
        Personagem personagem = new Personagem();
        Ui ui = new Ui();
        ui.setVisible(true);
        ui.button1.addActionListener(e -> {
            RolarAtributos.executar(personagem);
            rosto.desenhar(rosto.getGraphics(), personagem);
            System.out.println(personagem);
            switch (personagem.raca) {
                case HUMANO:
                personagem.nome = RolarAtributos.nome();
                personagem.forca += 23;
                ui.Panel2.setBackground(Color.red);

                break;
                case ELFO:
                personagem.nome = RolarAtributos.nomeelfo();
                personagem.destreza += 23;
                ui.Panel2.setBackground(Color.green);
                break;
                case ANAO:
                personagem.nome = RolarAtributos.nomeanao();
                personagem.constituicao += 23;
                ui.Panel2.setBackground(Color.yellow);
                break;
                case HALFLING:
                personagem.nome = RolarAtributos.nomehalfling();
                personagem.carisma += 23;
                ui.Panel2.setBackground(Color.blue);
                break;
            }
            ui.areaFicha.setText(personagem.toString());
            rosto.redesenhar(personagem);
       });


    }
}
