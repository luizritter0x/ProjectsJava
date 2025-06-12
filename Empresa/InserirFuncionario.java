package Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ADM
 */
public class InserirFuncionario {
    public void inserir(String nome, String email) {
        conexaoDB conexaoBD = new conexaoDB();
        Connection conexao = conexaoBD.conectar();
        if (conexao != null) {
            String sql = "INSERT INTO funcionarios (nome, cargo) VALUES (?, ?)";
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, nome);
                stmt.setString(2, email);
                stmt.executeUpdate();
                System.out.println("Funcionario inserido com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao inserir funcionarios");
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