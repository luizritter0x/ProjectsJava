package Empresa;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ADM
 */
public class Truncate {
    public void Truncate(String nome){
        conexaoDB conexaoBD = new conexaoDB();
        java.sql.Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
            String sql = "truncate table funcionarios";
            try(PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}