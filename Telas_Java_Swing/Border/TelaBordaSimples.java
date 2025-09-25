import javax.swing.*;
import java.awt.*;

public class TelaBordaSimples{
    private JFrame Tela;
    private JTextField txtTeste;
    private JLabel lblTeste;
    private JButton btnTeste;

    public TelaBordaSimples(){
        Tela = new JFrame("Bordas Simples");
        Tela.setSize(300,300);
        Tela.setResizable(false);
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Grid Layout
        Tela.setLayout(new GridBagLayout());
        GridBagConstraints Arrumar = new GridBagConstraints();
        Arrumar.anchor = GridBagConstraints.WEST;
        int linha = 0;

        Tela.setVisible(true);

    }
    public static void main(String[] args){
        new TelaBordaSimples();
    }
}