import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class TelaTxtDados {
    private JFrame Tela;
    private JTextField txtNome, txtId, txtPreco, txtData;
    private JLabel lblNome, lblId, lblPreco, lblData;
    private JButton btnEnviar;

    public TelaTxtDados(){
        Tela = new JFrame("Inserção de Dados");
        Tela.setSize(400,400);
        Tela.setResizable(false);
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Grid Layout
        Tela.setLayout(new GridBagLayout());
        GridBagConstraints Arrumar = new GridBagConstraints();
        Arrumar.anchor = GridBagConstraints.WEST;
        int linha = 0;

        lblId = new JLabel("Id");
        Arrumar.gridx = 0;
        Arrumar.gridy = linha;
        Tela.add(lblId, Arrumar);

        txtId = new JTextField(4);
        Arrumar.gridx = 1;
        Arrumar.gridy = linha;
        Tela.add(txtId, Arrumar);

        lblNome = new JLabel("Nome");
        Arrumar.gridx = 0;
        linha++;
        Arrumar.gridy = linha;
        Tela.add(lblNome, Arrumar);

        txtNome = new JTextField(10);
        Arrumar.gridx = 1;
        Arrumar.gridy = linha;
        Tela.add(txtNome, Arrumar);

        lblPreco = new JLabel("Preco");
        Arrumar.gridx = 0;
        linha++;
        Arrumar.gridy = linha;
        Tela.add(lblPreco, Arrumar);

        txtPreco = new JTextField(10);
        Arrumar.gridx = 1;
        Arrumar.gridy = linha;
        Tela.add(txtPreco, Arrumar);

        lblData = new JLabel("Data");
        Arrumar.gridx = 0;
        linha++;
        Arrumar.gridy = linha;
        Tela.add(lblData, Arrumar);

        txtData = new JTextField(10);
        Arrumar.gridx = 1;
        Arrumar.gridy = linha;
        Tela.add(txtData, Arrumar);

        btnEnviar = new JButton("Enviar");
        Arrumar.gridx = 0;
        linha++;
        Arrumar.gridy = linha;
        Arrumar.gridwidth = 2;
        Arrumar.anchor = GridBagConstraints.CENTER;

        btnEnviar.addActionListener((actionEvent) -> {
            String sql = "INSERT INTO objetos (nome, preco, data) VALUES (?,?,?)";
            Objeto objeto = new Objeto(0, txtNome.getText(), Double.parseDouble(txtPreco.getText()), txtData.getText());
            try{
                Connection Conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/tabela_dados?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","4840Senai**");
                PreparedStatement stmt = Conectar.prepareStatement(sql);
                stmt.setString(1, objeto.getNome());
                stmt.setDouble(2, objeto.getPreco());
                stmt.setString(3, objeto.getData());

                int LinhasAfetadas = stmt.executeUpdate();
                if(LinhasAfetadas > 0){
                    JOptionPane.showMessageDialog(Tela, "Dados Registrados");
                    txtId.setText("");
                    txtNome.setText("");
                    txtPreco.setText("");
                    txtData.setText("");

                }
            } catch(Exception erro){
                    JOptionPane.showMessageDialog(Tela, "Erro\n" + erro);
                
            }
        });

        Tela.add(btnEnviar, Arrumar);

        Tela.setVisible(true);
    }
    public static void main(String[] args) {
        new TelaTxtDados();
    }
}
