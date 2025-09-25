import java.awt.*;
import java.io.*;
import javax.swing.*;
public class FonteExterna {
    private JFrame Tela;
    private JLabel lblTitulo;

    public FonteExterna(){
        Tela = new JFrame("JTextField");
        Tela.setSize(300,300);
        Tela.setResizable(false);
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Grid Layout
        Tela.setLayout(new GridBagLayout());
        GridBagConstraints Arrumar = new GridBagConstraints();
        Arrumar.anchor = GridBagConstraints.WEST;

        lblTitulo = new JLabel("Fonte Instância");
        FontOups fonteOups = new FontOups("Oups.otf", 20);
        lblTitulo.setFont(fonteOups.getFonte());

        Tela.add(lblTitulo, Arrumar);
        Tela.setVisible(true);
    }
    public static void main(String[] args) {
        new FonteExterna();
    }
}
