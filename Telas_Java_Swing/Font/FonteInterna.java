import java.awt.*;
import java.io.*;

import javax.swing.*;
public class FonteInterna{
    private JFrame Tela;
    private JLabel lblTitulo;
    private Font Fonte;
    public FonteInterna(){
        Tela = new JFrame("JTextField");
        Tela.setSize(300,300);
        Tela.setResizable(false);
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Grid Layout
        Tela.setLayout(new GridBagLayout());
        GridBagConstraints Arrumar = new GridBagConstraints();
        Arrumar.anchor = GridBagConstraints.WEST;

        try{//CreateFont só funciona caso tenha os dois catch's abaixo
        File CaminhoFonte = new File("Oups.otf");
        Fonte = Font.createFont(Font.TRUETYPE_FONT, CaminhoFonte);
        Fonte = Fonte.deriveFont(Font.BOLD, 20);

        } catch(FontFormatException e){
            Fonte = new Font("Arial", Font.BOLD, 20);
        }catch(IOException e){
            Fonte = new Font("Arial", Font.BOLD, 20);
        }
        lblTitulo = new JLabel("Testando Fonte");
        lblTitulo.setFont(Fonte);
        Tela.add(lblTitulo, Arrumar);
        
        Tela.setVisible(true);
    }
    
    public static void main(String[] args) {
        new FonteInterna();
    }
}