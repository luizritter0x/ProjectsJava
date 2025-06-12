package Empresa;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ADM
 */
class DeletarFuncionario {
    public void deletar(String nome){
        conexaoDB conexaoBD = new conexaoDB();
        java.sql.Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
            String sql = "DELETE FROM funcionarios WHERE nome = ?;";
            try(PreparedStatement ps = conexao.prepareStatement(sql)){
                ps.setString(1, nome);
                ps.executeUpdate();
                System.out.println("Usuário deletado com sucesso!");
            }catch(SQLException e){
                System.out.println("Erro ao deletar usuário");
                e.printStackTrace();
            }finally{
                try{
                    conexao.close();
                }catch(SQLException e){
                  e.printStackTrace();
                }
            }
        }
    }
}