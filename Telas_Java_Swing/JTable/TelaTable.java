import javax.swing.*;
import java.awt.*;
public class TelaTable{
    private JFrame Tela;
    private JTable Tabela;
    public TelaTable(){
        Tela = new JFrame("Tabela com Dados Simples");
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tela.setResizable(false);
        Tela.setSize(400,400);

        //======= TABELA =======
            //Nome das Colunas
        String[] NomeColunas = {
            "Id", "Nome", "Idade", "Gênero"
        };

            //Dados Pré-Definidos
        Object[][] Dados = {
            {"01", "Tenéssio", "19", "Masc"},
            {"02", "Silício", "29", "Fem"},
            {"03", "Carbono", "24", "N-Bin"},
            {"04", "Xenônio", "200", "Masc"}
        };

            //Criação da Tabela
        Tabela = new JTable(Dados, NomeColunas);
        JScrollPane PainelTabela = new JScrollPane(Tabela); //A Tabela só pode ser vista com um JScrollPane
            //Adição da Tabela
        Tela.add(PainelTabela);

        
        Tela.setVisible(true);
    }
    public static void main(String[] args){
        new TelaTable();
    }
}