package minhaempresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExtrasFuncionario {

    public void adicionarAtributo(Scanner scanner) {
        conexaoDB conexaoBD = new conexaoDB();
        Connection conexao = null;

        System.out.println("--- Adicionar Informação Extra a Funcionário ---");
        System.out.print("Digite o NOME do funcionário para adicionar informações: ");
        String nomeFuncionario = scanner.nextLine();

        try {
            conexao = conexaoBD.conectar();
            if (conexao != null) {
                String sqlBuscarId = "SELECT id FROM funcionarios WHERE nome = ?";
                int funcionarioId = -1;
                try (PreparedStatement psBuscarId = conexao.prepareStatement(sqlBuscarId)) {
                    psBuscarId.setString(1, nomeFuncionario);
                    ResultSet rs = psBuscarId.executeQuery();
                    if (rs.next()) {
                        funcionarioId = rs.getInt("id");
                    }
                }

                if (funcionarioId == -1) {
                    System.out.println("Funcionário '" + nomeFuncionario + "' não encontrado.");
                    return;
                }

                String adicionarMaisAtributos;
                conexao.setAutoCommit(false);
                do {
                    System.out.print("Deseja adicionar uma nova informação para '" + nomeFuncionario + "'? (sim/não): ");
                    adicionarMaisAtributos = scanner.nextLine().toLowerCase();

                    if (adicionarMaisAtributos.equals("sim")) {
                        System.out.print("Digite o NOME da nova informação (ex: CPF, Salário): ");
                        String nomeAtributo = scanner.nextLine();

                        System.out.print("Digite o VALOR para '" + nomeAtributo + "': ");
                        String valorAtributo = scanner.nextLine();

                        String sqlInsertAtributo = "INSERT INTO funcionario_extras (funcionario_id, nome_atributo, valor_atributo) VALUES (?, ?, ?)";
                        try (PreparedStatement stmtAtributo = conexao.prepareStatement(sqlInsertAtributo)) {
                            stmtAtributo.setInt(1, funcionarioId);
                            stmtAtributo.setString(2, nomeAtributo);
                            stmtAtributo.setString(3, valorAtributo);
                            stmtAtributo.executeUpdate();
                            System.out.println("Informação '" + nomeAtributo + ": " + valorAtributo + "' adicionada com sucesso para " + nomeFuncionario + ".");
                        }
                    }
                } while (adicionarMaisAtributos.equals("sim"));

                conexao.commit();
                System.out.println("Gerenciamento de informações extras concluído para " + nomeFuncionario + ".");

            }
        } catch (SQLException e) {
            System.out.println("Erro ao gerenciar informações extras do funcionário: " + e.getMessage());
            e.printStackTrace();
            try {
                if (conexao != null) {
                    conexao.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}