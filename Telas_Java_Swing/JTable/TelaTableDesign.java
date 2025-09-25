import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class TelaTableDesign {
    private JFrame Tela;
    private JTable Tabela;
    
    public TelaTableDesign(){
        Tela = new JFrame("Estilização da JTable");
        Tela.setSize(400,400);
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tela.setResizable(false);
        
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
        
        //====== ESTILIZAÇÃO DA TABELA ===============
            //Header da Tabela
        JTableHeader HeaderT = Tabela.getTableHeader(); //Cabeçalho da Tabela
        HeaderT.setBackground(Color.RED);//Fundo do Header
        HeaderT.setForeground(Color.WHITE);//Cor das Letras do Header
        HeaderT.setFont(new Font("Arial", Font.BOLD, 14)); // Estilizar fonte

        //Linhas e Colunas da Tabela
        Tabela.setRowHeight(25); // Altura das linhas
        Tabela.setGridColor(Color.LIGHT_GRAY); // Cor das linhas da grid
        Tabela.setSelectionBackground(Color.BLACK);
        Tabela.setSelectionForeground(Color.WHITE);
        
        
        JScrollPane PainelTabela = new JScrollPane(Tabela);
        
        //Adição da Tabela ao centro do frame
        Tela.add(PainelTabela);

        Tela.setVisible(true);
    }
    
    // Método main para testar
    public static void main(String[] args) {
        new TelaTableDesign();
    }
}