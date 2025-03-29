import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RolarAtributos {

    Ui ui = new Ui();



    private static final List<String> nomesH = Arrays.asList("Aelfric", "Beorhthelm", "Ceolwulf", "Eadric", "Godwin", "Leofric", "Wulfric", "Oswin", "Aethelstan", "Cuthbert", "Hereward", "Eadwig", "Osbert", "Cyneheard", "Dunstan");
    private static final List<String> nomesHA = Arrays.asList("Bilbo", "Leto", "Matus", "Sam", "Baggins");
    private static final List<String> nomesE = Arrays.asList("Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric", "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral");
    private static final List<String> nomesA = Arrays.asList("Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek");
    private static final List<String> ibackgrounds = Arrays.asList("Nobre", "Criminoso", "Sábio", "Mago", "Mercante", "Político", "Religioso", "Bárbaro");
    private static final List<String> fbackgrounds = Arrays.asList("Falido", "Renegado", "Ganancioso", "Vingativo", "Covarde", "Desonrado", "Falhou no juramento", "Perdeu a família", "Aventureiro");
    private static final List<String> classes = Arrays.asList("Guerreiro", "Mago", "Ladino", "Clérigo");


    private static  int rolagem() {
        return new Random().nextInt(3, 18);
    }



    private static String lista() {
        Random lista = new Random();
        return ibackgrounds.get(lista.nextInt(ibackgrounds.size())) + " " + fbackgrounds.get(lista.nextInt(fbackgrounds.size()));
    }

    private static String classe() {
        Random classe = new Random();
        return classes.get(classe.nextInt(classes.size()));
    }

    private static Raca racas() {
        return Raca.values()[(new Random()).nextInt(Raca.values().length)];
    }

    public static String nome() {
        Random nome = new Random();
        return (String)nomesH.get(nome.nextInt(nomesH.size()));
    }

    public static String nomeelfo() {
        Random nomeelfo = new Random();
        return (String)nomesE.get(nomeelfo.nextInt(nomesE.size()));
    }

    public static String nomeanao() {
        Random nomeanao = new Random();
        return (String)nomesA.get(nomeanao.nextInt(nomesA.size()));
    }

    public static String nomehalfling() {
        Random nomehalfling = new Random();
        return (String)nomesHA.get(nomehalfling.nextInt(nomesHA.size()));
    }

    public static void executar(Personagem personagem) {
        personagem.nome = nome();
        personagem.nomeelfo = nomeelfo();
        personagem.nomeanao = nomeanao();
        personagem.nomehalfling = nomehalfling();
        personagem.forca = rolagem();
        personagem.carisma = rolagem();
        personagem.constituicao = rolagem();
        personagem.destreza = rolagem();
        personagem.inteligencia = rolagem();
        personagem.sabedoria = rolagem();
        personagem.backgrounds = lista();
        personagem.classe = classe();
        personagem.raca = racas();
    }
    enum Raca {
        HUMANO("Humano"),
        ELFO("Elfo"),
        ANAO("Anão"),
        HALFLING("Halfling");

        final String descricao;

        private Raca(String descricao) {
            this.descricao = descricao;
        }

        public String toString() {
            return this.descricao;
        }
    }
}