import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;

public class Ui {
    private JFrame frame;

    private JTextField GERADORDEFICHAGENÉRICOTextField;
    public JButton button1;

    private JLabel Nome;
    private JLabel Label;
    private JPanel Panel;
    public JTextArea areaFicha;
    private JTextField textField1;
    private JTextField textField2;


    public Ui() {
        frame = new JFrame("Gerador de Ficha Genérico");
        frame.setContentPane(Panel);
        frame.setSize(500, 500);
        Panel.setVisible(true);
        Nome.setText("Nome");
        Label.setText("jogador");
        button1.setVisible(true);
        areaFicha.setVisible(true);






        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        frame.setVisible(true);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void setVisible(boolean b) {
    }


    }

