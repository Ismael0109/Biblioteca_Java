import java.awt.*;
import javax.swing.*;
public class TelaMenu{
    private JFrame Tela;
    public TelaMenu(){
        Tela = new JFrame("Menu");
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tela.setResizable(false);
        Tela.setSize(400, 400);
        Tela.setLayout(new GridBagLayout());
        //Grid
        GridBagConstraints Arrumar = new GridBagConstraints();
        Arrumar.insets = new Insets(5, 5, 5, 5);
        Arrumar.anchor = GridBagConstraints.CENTER;
        Arrumar.fill = GridBagConstraints.NONE;

        int linha = 0;
        //Barra Menu
        JMenuBar BarraMenu = new JMenuBar();
        BarraMenu.setBackground(Color.decode("#AAF48E")); //Cor do Fundo
        BarraMenu.setForeground(Color.WHITE);
        
            //Itens do Menu
            //===========ADIÇÃO DE ABAS DO MENU=============
                //Aba Arquivo
        JMenu AbaArquivo = new JMenu("Arquivo");
        AbaArquivo.setForeground(Color.GREEN);//Cor do Texto

        JMenuItem miNovo = new JMenuItem("Novo");
        JMenuItem miExistente = new JMenuItem("Existente");
        AbaArquivo.add(miNovo);
        AbaArquivo.add(miExistente);
        BarraMenu.add(AbaArquivo);

                //Aba Editar
        JMenu AbaEditar = new JMenu("Editar");
        JMenuItem miRefazer = new JMenuItem("Refazer");
        JMenuItem miDesfazer = new JMenuItem("Desfazer");
        AbaEditar.add(miRefazer);
        AbaEditar.add(miDesfazer);

        //=================CLIQUE===================
                    //Evento de Clique
        miRefazer.addActionListener((actionEvent) -> {
            JOptionPane.showMessageDialog(Tela, "Mensagem: Refeito!!");
        });
        BarraMenu.add(AbaEditar);

        Tela.setJMenuBar(BarraMenu);

        
        Tela.setVisible(true);
    }
    public static void main(String[] args) {
    new TelaMenu();
}
}