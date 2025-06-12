package Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

class ConsultarFuncionario {
    public void consultar() throws SQLException {
        conexaoDB conexaoBD = new conexaoDB();
        Connection conexao = conexaoBD.conectar();

        if (conexao != null) {
            String sql = "SELECT * FROM funcionarios;";
            try(PreparedStatement ps = conexao.prepareStatement(sql);
                ResultSet resultado = ps.executeQuery()){
                
                System.out.println("Lista de funcionarios:");
                while(resultado.next()){
                    int id = resultado.getInt("id");
                    String nome = resultado.getString("nome");
                    String cargo = resultado.getString("cargo");
                    System.out.println("ID: "+id+"\nNome: "+nome+"\nCargo: "+cargo);
                }
            }catch(SQLException e){
                System.out.println("Erro ao consultar usuários");
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