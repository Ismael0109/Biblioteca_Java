import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.List; // Necessita.

public class TelaTableDados {
    private JFrame Tela;
    private JTable Tabela;

    public TelaTableDados(){
        Tela = new JFrame("Estilização da JTable");
        Tela.setSize(400,400);
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tela.setResizable(false);

        //Nome das Colunas
        String[] NomeColunas = {"Id", "Nome", "Preco", "Data"};

        //Dados
        String sql = "SELECT * FROM objetos";//Comando
        List<Objeto> Dados = new ArrayList<>(); //<Objeto> vai usar a Classe Objeto como modelo para as linhas da Lista

        try{ //Para a conexão funcionar, precisa da pasta lin com o Driver de Conexão
            Connection Conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/tabela_dados?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","4840Senai**");
            PreparedStatement stmt = Conectar.prepareStatement(sql);

            ResultSet ResultadoDados = stmt.executeQuery();
            //ResultSet guarda dados do banco em tabela, enquanto executeQuery() pega os valores adquiridos pelo comando no stmt.

            while(ResultadoDados.next()){ //.next() retorna verdadeiro se ainda há uma linha após a atual.
                int Id = ResultadoDados.getInt("id");
                String Nome = ResultadoDados.getString("nome");
                double Preco = ResultadoDados.getDouble("preco");
                String Data = ResultadoDados.getString("data");

                Objeto objeto = new Objeto(Id, Nome, Preco, Data);
                Dados.add(objeto);//Adiciona os Registros Adquiridos na Lista de Dados
            }

            DefaultTableModel ModeloTabela = new DefaultTableModel(NomeColunas, 0); //Cria um modelo para a tabela

            for (Objeto objeto1 : Dados) {//Foreach: Roda o Código para cada linha da Lista Dados
                Object[] linhaT = {
                    objeto1.getId(),
                    objeto1.getNome(),
                    objeto1.getPreco(),
                    objeto1.getData()
                };
                ModeloTabela.addRow(linhaT);
            }
            Tabela = new JTable(ModeloTabela);
            JScrollPane PainelTabela = new JScrollPane(Tabela);
            Tela.add(PainelTabela);

        }catch(Exception erro){
            System.out.println("Erro\n" + erro);
        }
        Tela.setVisible(true);

    }
    public static void main(String[] args) {
        new TelaTableDados();
    }
}
