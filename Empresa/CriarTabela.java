package Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarTabela {
    public void criar() {
        conexaoDB conexaoBD = new conexaoDB();
        Connection conexao = conexaoBD.conectar();
        if (conexao != null) {
            String sql = "CREATE TABLE IF NOT EXISTS funcionarios (" +
                         "id INT AUTO_INCREMENT PRIMARY KEY," +
                         "nome VARCHAR(100)," +
                         "cargo VARCHAR(100)" +
                         ")";
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.execute();
                System.out.println("Tabela 'funcionarios' criada com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao criar a tabela 'funcionarios'");
                e.printStackTrace();
            } finally {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}