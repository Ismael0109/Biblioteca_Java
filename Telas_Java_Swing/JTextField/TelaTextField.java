import javax.swing.*;
import java.awt.*;

public class TelaTextField{
    private JFrame Tela;
    private JTextField txtNome, txtIdade;

    public TelaTextField(){
        Tela = new JFrame("JTextField");
        Tela.setSize(200,200);
        Tela.setResizable(false);
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Grid Layout
        Tela.setLayout(new GridBagLayout());
        GridBagConstraints Arrumar = new GridBagConstraints();
        Arrumar.anchor = GridBagConstraints.WEST;

        //====== JTextField ======
        txtNome = new JTextField(10); //Quantas colunas vai ocupar
        //========== ESTILIZAÇÃO DO JTextField ========
        txtNome.setSelectedTextColor(Color.CYAN); //Muda a Cor do Texto Selecionado
        txtNome.setBackground(Color.BLACK);
        txtNome.setForeground(Color.decode("#EF23EF"));
        Arrumar.gridx = 0;
        Arrumar.gridy = 0;
        Tela.add(txtNome, Arrumar);

        txtIdade = new JTextField(5); //Quantas colunas vai ocupar
        Arrumar.gridx = 0;
        Arrumar.gridy = 2;
        Tela.add(txtIdade, Arrumar);

        Tela.setVisible(true);
    }
    public static void main(String[] args){
        new TelaTextField();
    }
}