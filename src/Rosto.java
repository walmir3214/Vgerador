import javax.swing.*;
import java.awt.*;

public class Rosto extends JFrame {
    private Personagem personagematual;
    private rostoPanel panel3;

    public Rosto(){
        setTitle("Rosto");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        panel3 = new rostoPanel();
        setContentPane(panel3);

    }
    public void redesenhar(Personagem p){
        this.personagematual = p;
        panel3.repaint();
    }
    class rostoPanel extends JPanel {
        public rostoPanel(){
            setBackground(Color.white);
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (personagematual != null) {
                desenhar(g, personagematual);
            }
        }
    }
    public void desenharRosto(Graphics g) {
        g.drawRect(200, 150, 100, 100);
        g.setColor(Color.yellow);
        setVisible(true);
    }



    public void desenharOlhos(Graphics g){
        g.setColor(Color.blue);
        g.drawArc(220, 180, 20, 20, 0, 360); // Olho esquerdo
        g.drawArc(260, 180, 20, 20, 0, 360); // Olho direito
        setVisible(true);
    }

    // Olhos 2: Fechados
    public void desenharOlhosFechados(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(220, 190, 240, 190); // esquerdo
        g.drawLine(260, 190, 280, 190); // direito
    }

    // Olhos 3: Arregalados
    public void desenharOlhosArregalados(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(218, 178, 24, 24); // contorno maior
        g.drawOval(258, 178, 24, 24);
        g.setColor(Color.BLUE);
        g.fillOval(228, 185, 6, 6); // pupilas
        g.fillOval(268, 185, 6, 6);
    }

    // Olhos 4: Com sobrancelhas
    public void desenharOlhosComSobrancelha(Graphics g) {
        // Sobrancelhas
        g.setColor(new Color(80, 40, 0)); // marrom escuro
        g.drawLine(220, 170, 240, 175); // sobre olho esquerdo
        g.drawLine(260, 175, 280, 170); // sobre olho direito

        // Olhos padrão
        g.setColor(Color.BLUE);
        g.drawArc(220, 180, 20, 20, 0, 360);
        g.drawArc(260, 180, 20, 20, 0, 360);
    }

    // Olhos 5: Com cicatriz (no olho esquerdo)
    public void desenharOlhosComCicatriz(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawArc(220, 180, 20, 20, 0, 360);
        g.drawArc(260, 180, 20, 20, 0, 360);

        // Cicatriz
        g.setColor(Color.RED);
        g.drawLine(215, 175, 225, 190);
        g.drawLine(215, 180, 225, 195);
    }

    public void desenharBoca(Graphics g){
        g.setColor(Color.red);
        g.drawArc(220, 220, 60, 20, 0, -180); // Boca
        setVisible(true);
    }
    // Boca 2: Triste
    public void desenharBocaTriste(Graphics g) {
        g.setColor(Color.RED);
        g.drawArc(220, 230, 60, 20, 0, 180); // curva pra baixo
    }

    // Boca 3: Aberta (tipo surpresa)
    public void desenharBocaAberta(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(240, 220, 20, 30); // boca aberta oval
    }

    // Boca 4: Neutra (reta)
    public void desenharBocaNeutra(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(230, 230, 270, 230); // linha reta
    }

    public void desenhar(Graphics g, Personagem p){
        switch (p.raca) {
            case HUMANO:
                desenharRosto(g);
                desenharCabelo(g);
                desenharOlhosComCicatriz(g);
                desenharBocaNeutra(g);
                break;
            case ELFO:
                desenharRosto(g);
                desenharCabelo2(g);
                desenharBocaAberta(g);
                desenharOlhosArregalados(g);
                break;
            case ANAO:
                desenharRosto(g);
                desenharCabelo3(g);
                desenharBocaTriste(g);
                desenharOlhosComSobrancelha(g);
                break;
            case HALFLING:
                desenharRosto(g);
                desenharCabelo4(g);
                desenharBoca(g);
                desenharOlhosComCicatriz(g);
                break;
        }
    }
    public void desenharCabelo(Graphics g){
        g.setColor(Color.black);
        g.fillArc(200, 130, 100, 50, 0, 180); // Cabelo
        setVisible(true);
    }
    public void desenharCabelo2(Graphics g){
        g.setColor(Color.green);
        g.fillArc(200, 130, 100, 50, 12, 190); // Cabelo
        setVisible(true);
    }
    public void desenharCabelo4(Graphics g){
        g.setColor(Color.blue);
        g.fillArc(200, 130, 100, 50, 12, 190); // Cabelo
        setVisible(true);
    }
    public void desenharCabelo3(Graphics g){
        g.setColor(Color.red);
        g.fillArc(200, 130, 100, 50, 12, 190); // Cabelo
        setVisible(true);
    }



}
