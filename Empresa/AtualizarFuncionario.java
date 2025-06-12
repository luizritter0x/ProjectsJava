package Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ADM
 */
class AtualizarFuncionario {
    
    public static void atualizar(String nome, String novoCargo) {
        conexaoDB conexaoBD = new conexaoDB();
        Connection conexao = conexaoBD.conectar();
        
        if (conexao != null) {
            String sql = "update funcionarios set cargo = ? where nome = ?;";
             try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, novoCargo);
                ps.setString(2, nome);
                
                ps.executeUpdate();
                System.out.println("Funcionario atualizado com sucesso");
            } catch(SQLException e) {
                 System.out.println("erro ao atualizar o funcionario");
                 e.printStackTrace();
            } finally {
                 try {
                     conexao.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        }
    }

}
